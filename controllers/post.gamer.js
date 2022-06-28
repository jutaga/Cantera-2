//crear 
const express = require('express');
const router = express.Router();

const Gamer = require('../models/gamer.model');

module.exports = router;

// post gamers listing. 
router.post('/gamer', async (req, res, next) => {
  try {
    const {gamers} = req.body;  //pedir los datos , lo dentro de const son los datos que se deben recibir  
    const gamer= new Gamer({gamers}); //crear el dato
    const data = await gamer.save(); //guardar los datos
    res.json({message: 'Gamers created successfully',
    data
  })

  .catch((err) => {res.status(400).json({
    error: err.message,
    message: "Game creation failed"
  })});

  } catch (error) {
    res.status(500).json({message: error.message,
    stack: error.stack});
  }
});


