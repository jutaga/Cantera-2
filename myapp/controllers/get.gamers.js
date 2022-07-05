//para traer datos

const express = require('express');
const router = express.Router();

const User = require('../models/gamer.model');

/* GET users listing. */
router.get('/gamers', async (req, res, next) => {

  try {
    const data = await User.find({}); //traemos los datos
    res.json({data});
    
  } catch (error) {
    res.status(500).json({message: error.message,
    stack: error.stack}); 
  }
});

module.exports = router;
