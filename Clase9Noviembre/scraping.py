from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from bs4 import BeautifulSoup
import time

# URL de la página
url = "https://estudiantes.portaloas.udistrital.edu.co/appserv/estudianteCreditos/estudianteCreditos.php"

# Inicia el navegador Selenium (descarga el controlador correspondiente para tu navegador)
driver = webdriver.Chrome()

# Accede a la página
driver.get(url)

# Introduce las credenciales (reemplaza 'tu_usuario' y 'tu_contraseña' con tus credenciales reales)
usuario = "tu_usuario"
contraseña = "tu_contraseña"

# Encuentra los campos de usuario y contraseña e ingresa la información
driver.find_element('name', 'usuario').send_keys(usuario)
driver.find_element('name', 'password').send_keys(contraseña)

# Envía el formulario de inicio de sesión
driver.find_element('name', 'accion').click()

# Espera a que la página se cargue completamente (puedes ajustar el tiempo según sea necesario)
time.sleep(5)  # Aquí, espera 5 segundos, pero puedes ajustar esto según tu necesidad

# Obtiene el contenido de la página después del inicio de sesión
html_content = driver.page_source

# Cierra el navegador
driver.quit()

# Parsea el contenido HTML con BeautifulSoup
soup = BeautifulSoup(html_content, 'html.parser')

# Aquí puedes continuar con el código anterior para extraer la información de la tabla 'sigma'

