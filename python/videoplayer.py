import requests
from bs4 import BeautifulSoup

user_agent = 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.14; rv:76.0) Gecko/20100101 Firefox/76.0'

input_url = input("Enter url: ")
base = BeautifulSoup(requests.get(input_url).text, 'html.parser')
file_name = str(base.findAll("title")[0].next)[6:-1].replace(" ", "_") + ".mp4"
url = base.find(id="hide-cizgi-video-0").find_next('a')['href']
soup = BeautifulSoup(requests.get(url).text, 'html.parser')

new_url = ""
for meta in soup.findAll('meta'):
    if meta['content'][1:4] == "inc":
        new_url = meta['content'][37:123]

almost_headers = {
    'User-Agent': user_agent,
    'X-Requested-With': 'XMLHttpRequest'
}

almost_url = f"https://www.thewatchcartoononline.tv/inc/embed/getvidlink.php?v=cizgi/{new_url}.mp4&embed=cizgi"
response = requests.request("GET", almost_url, headers=almost_headers).json()

middle = "/getvid?evid="
server = "https://disk20" + response['server'][11:]

final = server + middle + response['enc']

final_response = requests.request("GET", final, headers={'User-Agent': user_agent}, stream=True)
with open(file_name, 'wb') as f:
    for chunk in final_response.iter_content(chunk_size=1024 * 1024):
        if chunk:
            f.write(chunk)
