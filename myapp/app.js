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
app.use(express.static(path.join(__dirname, "public")));
app.set('view engine', 'pug');





//GET /api/v1/users
app.use('/api/v1', require('./controllers/get.gamers'));

//GET  /api/v1/user/:id
app.use('/api/v1', require('./controllers/get.gamer'));

//POST /api/v1/user/
app.use('/api/v1', require('./controllers/post.gamer'));
app.set('view engine', 'pug');

app.get('/',(req, res) => {
    res.render('page',{})
});


module.exports = app;