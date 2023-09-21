const express = require('express');
const app = express();

const port = 8080;

app.get('/', (req, res) => {
  res.send('Bienvenido a mi microservicio con Node.js!');
});

app.get('/message1', (req, res) => {
  res.send('Hola Mundo!');
});

app.get('/message2', (req, res) => {
  res.send('Hola Valle Grande!');
});

app.get('/message3', (req, res) => {
  const jsonResponse = {
    message: 'Hola desde getMessage3',
    author: 'Pedro Porras Luyo',
    tags: ['Node.js', 'Express', 'API']
  };

  res.json(jsonResponse);
});

app.listen(port, () => {
  console.log(`El microservicio está corriendo en el puerto ${port}`);
});
