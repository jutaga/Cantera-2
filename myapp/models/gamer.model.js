//crear el modelo de los datos

const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const gamersModelShema = new Schema({

    gamers:[{
        type: String,    
        trim: true,    
    }]

});

const gamersModel = mongoose.model('Gamers',gamersModelShema) //para hacer efectiva la construccion , 'Gamers' es el nombre de la coleccion
module.exports = gamersModel;