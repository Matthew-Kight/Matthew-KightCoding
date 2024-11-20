import string
import random
import PySimpleGUI as sg

sg.theme("DarkTeal9")

layout = [
    [sg.Text("Password Length", size=(15, 1)), sg.InputText()],
    [sg.Submit(), sg.Exit()]
]

window = sg.Window("Password Generator", layout)

while True:
    event, values = window.read()
    if event == sg.WIN_CLOSED or event == 'Exit':
        break
    if event == 'Submit':
        s1 = string.ascii_lowercase
        s2 = string.ascii_uppercase
        s3 = string.digits
        s4 = string.punctuation

        plen = values

        s = []
        s.extend(list(s1))
        s.extend(list(s2))
        s.extend(list(s3))
        s.extend(list(s4))

        sg.popup("".join(random.sample(s, plen)))

window.close()


s1 = string.ascii_lowercase
s2 = string.ascii_uppercase
s3 = string.digits
s4 = string.punctuation

plen = int(input("Enter password length: "))

s = []
s.extend(list(s1))
s.extend(list(s2))
s.extend(list(s3))
s.extend(list(s4))

print("Your password: ", end="")
print("".join(random.sample(s, plen)))
