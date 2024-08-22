import requests
from bs4 import BeautifulSoup

url = 'https://www.gcet.ac.in'
reqs = requests.get(url)
soup = BeautifulSoup(reqs.text , 'lxml')
print(f"Find and print all p tag\n")
for tag in soup.find_all("p"):
    print("{0}:{1}".format(tag.name , tag.text))