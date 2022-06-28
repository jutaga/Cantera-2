//crear el modelo de los datos

const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const gamerModelShema = new Schema({
    gamers: [{
        type: String,
        trim: true
    }]
});

const gamerModel = mongoose.model('Gamer',gamerModelShema) //para hacer efectiva la construccion , 'Gamer' es el nombre de la coleccion
module.exports = gamerModel;