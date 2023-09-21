from flask import Flask, jsonify

app = Flask(__name__)

@app.route('/')
def get_introduction():
    return "Bienvenido a mi microservicio con Flask + Python 3.9!.."

@app.route('/message1')
def get_message1():
    return "Hola Mundo!"

@app.route('/message2')
def get_message2():
    return "Hola Valle Grande!"

@app.route('/message3')
def get_message3():
    jsonResponse = {
        "message": "Hola desde getMessage3",
        "author": "Pedro Porras Luyo",
        "tags": ["Flask", "Python 3.9", "API"]
    }
    return jsonify(jsonResponse)

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=8080)

