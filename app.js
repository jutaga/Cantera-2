//da inicio a nuestro sistema , de aqui nos conectamos a la base de datos
const path = require("path");
const logger = require('morgan');
const express = require('express');
const cookieParser = require('cookie-parser');
const mongoose = require('mongoose');
require('dotenv').config({
    path:  `./environments/development.env` //para traer el entorno de desarrollo
});

const app = express();

//conectarse a mongodb
mongoose.connect(process.env.MONGODB_URI).then(() => {
    console.log('Connected to MongoDB');
}).catch(err => {
    console.log(err);
});

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use("/public", express.static('./public/'));


app.set('view engine', 'hbs');
app.get('/createGame', (req, res) => res.render('createGame', {}));


//GET /api/v1/gamer/winner
app.use('/api/v1', require('./controllers/get.winner'));

//GET  /api/v1/gamer/:id
app.use('/api/v1', require('./controllers/get.gamer'));

//POST /api/v1/gamer/
app.use('creategame', require('./controllers/post.gamer'));

app.use('/api/v1', require('./controllers/gamers')); 

app.use("createGame", require('./controllers/createGame'))


module.exports = app;

