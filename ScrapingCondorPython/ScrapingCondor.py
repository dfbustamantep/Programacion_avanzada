""""
from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# Configura las opciones del controlador
chrome_options = Options()
chrome_options.add_argument("--headless")  # Puedes quitar esto si no es necesario
chrome_options.binary_location = "/c/Users/DBustamanteP/Downloads/chromedriver_win32/chromedriver"

# Crea el controlador con las opciones
driver = driver = webdriver.Chrome()

# Crea el controlador con las opciones
#driver = webdriver.Chrome(options=chrome_options, executable_path="/c/Users/DBustamanteP/Downloads/chromedriver_win32/chromedriver")

usuario = "20221578028"
clave = "marinamora2021+"

url = "https://estudiantes.portaloas.udistrital.edu.co/appserv/"

#driver = webdriver.Chrome("/c/Users/DBustamanteP/Downloads/chromedriver_win32/chromedriver")

driver.get(url)
"""
""""
driver.find_element_by_name(usuario).send_keys(usuario)
driver.find_element_by_name(clave).send_keys(clave)

driver.find_element_by_id("ingresar").click()
"""
"""
# Espera a que el elemento con el nombre de usuario esté presente en la página
usuario_input = WebDriverWait(driver, 10).until(
    EC.presence_of_element_located((By.NAME, usuario))
)

# Ingresa el usuario y la clave
usuario_input.send_keys(usuario)
driver.find_element(By.NAME, "clave").send_keys(clave)

# Encuentra el botón e ingresa
driver.find_element(By.ID, "ingresar").click()
"""
""""
from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# Configura las opciones del controlador
chrome_options = Options()
chrome_options.add_argument("--headless")

# Crea el controlador con las opciones
driver = webdriver.Chrome(options=chrome_options, executable_path="C:/Users/DBustamanteP/Downloads/chromedriver_win32/chromedriver")

usuario = "20221578028"
clave = "marinamora2021+"

url = "https://estudiantes.portaloas.udistrital.edu.co/appserv/"

driver.get(url)

# Espera a que el elemento con el nombre de usuario esté presente en la página
usuario_input = WebDriverWait(driver, 10).until(
    EC.presence_of_element_located((By.NAME, "usuario"))
)

# Ingresa el usuario y la clave
usuario_input.send_keys(usuario)
driver.find_element(By.NAME, "clave").send_keys(clave)

# Encuentra el botón e ingresa
driver.find_element(By.ID, "ingresar").click()
"""

# Curl
"""
curl 'https://estudiantes.portaloas.udistrital.edu.co/academicopro/index.php?index=7CJcNpTPf8co-THA5rmAfCc3dwRDthppoithhsm7ExscY77XoMuIORS62SBdGhhYmkexLB8beK2XJgRcHJjTGSQp8nES0BVHOUkM33MgT5DZPp9xeh6glB2t40SaOLWy8ThMjgr0AnxpzitszaMyN32yzSax8JlSEA8PTQ_4qdHMd732bhB0TD0EOM4orQMTutfpkzCWPfO9l2o1RW8ItQ' \
  -H 'Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7' \
  -H 'Accept-Language: en-US,en;q=0.9,es;q=0.8' \
  -H 'Connection: keep-alive' \
  -H 'Cookie: _ga_BBELX6EBX1=GS1.1.1694267399.1.0.1694267399.0.0.0; _clck=1jjqhz3|2|fex|0|1347; _ga=GA1.3.1189552335.1694267184; twk_uuid_5f06483867771f3813c0af27=%7B%22uuid%22%3A%221.92NeMew3DsFzovakCeiIpHCnoebJSGUCEpzsIAlz2H4b30yP9YBZF0O74QgoBk8Tn4X3G0lsNw9kcgUOeHbEme1F7ZgVfjpbajO9Ylvf4eqT9KdvvjpMb0ZBB4AR%22%2C%22version%22%3A3%2C%22domain%22%3A%22udistrital.edu.co%22%2C%22ts%22%3A1694392468447%7D; _ga_DDY0LDR6NL=GS1.1.1694392467.5.1.1694392926.0.0.0; condorUDUser=p33e5qha3q989n7dpin5959ug2; aplicativo=fe3f15e292aaa73f42d4494cb8ce7c7b' \
  -H 'Referer: https://estudiantes.portaloas.udistrital.edu.co/appserv/estudianteCreditos/est_pag_menu.php' \
  -H 'Sec-Fetch-Dest: frame' \
  -H 'Sec-Fetch-Mode: navigate' \
  -H 'Sec-Fetch-Site: same-origin' \
  -H 'Sec-Fetch-User: ?1' \
  -H 'Upgrade-Insecure-Requests: 1' \
  -H 'User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36' \
  -H 'sec-ch-ua: "Google Chrome";v="119", "Chromium";v="119", "Not?A_Brand";v="24"' \
  -H 'sec-ch-ua-mobile: ?0' \
  -H 'sec-ch-ua-platform: "Windows"' \
  --compressed
"""
#https://curlconverter.com/
#copiamos el curl de bash
import requests
from pprint import pprint
#import datatime
from bs4 import BeautifulSoup
import pandas as pd
import os

 # Diccionario que contiene cookies para la solicitud HTTP
cookies = {
    '_ga_BBELX6EBX1': 'GS1.1.1694267399.1.0.1694267399.0.0.0',
    '_clck': '1jjqhz3|2|fex|0|1347',
    '_ga': 'GA1.3.1189552335.1694267184',
    'twk_uuid_5f06483867771f3813c0af27': '%7B%22uuid%22%3A%221.92NeMew3DsFzovakCeiIpHCnoebJSGUCEpzsIAlz2H4b30yP9YBZF0O74QgoBk8Tn4X3G0lsNw9kcgUOeHbEme1F7ZgVfjpbajO9Ylvf4eqT9KdvvjpMb0ZBB4AR%22%2C%22version%22%3A3%2C%22domain%22%3A%22udistrital.edu.co%22%2C%22ts%22%3A1694392468447%7D',
    '_ga_DDY0LDR6NL': 'GS1.1.1694392467.5.1.1694392926.0.0.0',
    'condorUDUser': '17kogohos9ufi0v60bdntat7h7',
    'aplicativo': '669bb5e53d0de00b6fffaa75dde881b8',
}

# Diccionario que contiene encabezados para la solicitud HTTP.
headers = {
    'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7',
    'Accept-Language': 'en-US,en;q=0.9,es;q=0.8',
    'Connection': 'keep-alive',
    # 'Cookie': '_ga_BBELX6EBX1=GS1.1.1694267399.1.0.1694267399.0.0.0; _clck=1jjqhz3|2|fex|0|1347; _ga=GA1.3.1189552335.1694267184; twk_uuid_5f06483867771f3813c0af27=%7B%22uuid%22%3A%221.92NeMew3DsFzovakCeiIpHCnoebJSGUCEpzsIAlz2H4b30yP9YBZF0O74QgoBk8Tn4X3G0lsNw9kcgUOeHbEme1F7ZgVfjpbajO9Ylvf4eqT9KdvvjpMb0ZBB4AR%22%2C%22version%22%3A3%2C%22domain%22%3A%22udistrital.edu.co%22%2C%22ts%22%3A1694392468447%7D; _ga_DDY0LDR6NL=GS1.1.1694392467.5.1.1694392926.0.0.0; condorUDUser=17kogohos9ufi0v60bdntat7h7; aplicativo=669bb5e53d0de00b6fffaa75dde881b8',
    'Referer': 'https://estudiantes.portaloas.udistrital.edu.co/appserv/estudianteCreditos/est_pag_menu.php',
    'Sec-Fetch-Dest': 'frame',
    'Sec-Fetch-Mode': 'navigate',
    'Sec-Fetch-Site': 'same-origin',
    'Sec-Fetch-User': '?1',
    'Upgrade-Insecure-Requests': '1',
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36',
    'sec-ch-ua': '"Google Chrome";v="119", "Chromium";v="119", "Not?A_Brand";v="24"',
    'sec-ch-ua-mobile': '?0',
    'sec-ch-ua-platform': '"Windows"',
}

# Parámetros que se incluirán en la URL de la solicitud.
params = {
    'index': 'mClHx-m_sB_AiTKR9TQo4KhM800aJirc7LzedeOC2MMoxLtuBEfnQEofBRTIjN4TqTkp3fzwElcs3OUhaDJBfe5bstqt-Pr64EuwlKCzS-QTlLWk3QbjllMWc1dQvkLNIIjfgQ-ZDJpsqAEDWoNmBgam5RfeLF7FEm8ireekvA8Q_gOYBIb53JEsBd86wHsupy9lyzafb-NxAfzq2Nko2Q',
}

response = requests.get(
    'https://estudiantes.portaloas.udistrital.edu.co/academicopro/index.php',
    params=params,
    cookies=cookies,
    headers=headers,
)

soup = BeautifulSoup(response.content,"html.parser")

def HistorialNotas(soup):
    
    tabla = soup.find_all("table",attrs={"class":"sigma"})
    datos = []

    for nivel,tabla_nivel in enumerate (tabla,start=1):
        filas = tabla_nivel.find_all("tr")
        for filas in filas[2:]:
            celdas = filas.find_all("td")

            if len(celdas) == 8:
                asignatura = celdas[0].text.strip()
                nombre = celdas[1].text.strip()
                nota = celdas[2].text.strip()
                creditos = celdas[3].text.strip()
                clasificacion = celdas[4].text.strip()
                year = celdas[5].text.strip()
                periodo = celdas[6].text.strip()
                observacion = celdas[7].text.strip()

                datos.append({
                    'Asignatura':asignatura,
                    'Nombre':nombre,
                    'Nota':nota,
                    'Creditos':creditos,
                    'Clasificacion':clasificacion,
                    'Año':year,
                    'Periodo':periodo,
                    'Observacion':observacion,
                })
            #else:
             #   print("Advertencia")    
    return datos   

def guardar(datos, nombre_archivo, titulo="Datos Guardados"):
    # Obtener la ruta completa del archivo en la misma carpeta del script
    ruta_completa = os.path.join(os.path.dirname(__file__), nombre_archivo)

    try:
        with open(ruta_completa, 'w') as archivo:
            archivo.write(f"{titulo}\n")
            archivo.write('-' * 80 + '\n')  # Separador entre título y datos
            for asignatura_info in datos:
                for clave, valor in asignatura_info.items():
                    linea = f"{clave}: {valor}"
                    archivo.write(linea + '\n')
                archivo.write('-' * 40 + '\n')   # Separador entre datos
        print(f"Datos guardados exitosamente en {ruta_completa}")
    except IOError as e:
        print(f"Error al guardar datos en {ruta_completa}: {e}")

def guardarExcel(datos, nombre_archivo, titulo="Datos Guardados"):
    # Obtener la ruta completa del archivo en la misma carpeta del script
    ruta_completa = os.path.join(os.path.dirname(__file__), nombre_archivo)

    try:
        df = pd.DataFrame(datos)
        df.to_excel(ruta_completa, index=False, sheet_name='Historial Académico')
        print(f"Datos guardados exitosamente en {ruta_completa}")
    except IOError as e:
        print(f"Error al guardar datos en {ruta_completa}: {e}")

print("Datos")
#print(HistorialNotas(soup))
#pprint(HistorialNotas(soup))

historial = HistorialNotas(soup)

for asignatura_info in historial:
    for clave, valor in asignatura_info.items():
        print(f"{clave}: {valor}")
    print('-' * 40)  # Separador entre asignaturas
    print()  # Línea en blanco entre asignaturas
 
guardar(HistorialNotas(soup), 'historialAcademico.txt', titulo="Historial Académico Daniel Felipe Bustamante Perez")
guardarExcel(HistorialNotas(soup), 'historialAcademico.xlsx', titulo="Datos Guardados")