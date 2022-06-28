//para traer datos

const express = require('express');
const router = express.Router();

const Gamer = require('../models/gamer.model');

/* GET users listing. */
router.get('/gamer/:id/winner', async (req, res, next) => {

  try {
  /*   const data = await User.find({}); //traemos los datos
    res.json({data}); */
    const data = Gamer.find({
      $or: [
        { 'deleted': {$eq: false} },
        { 'deleted': {$exists: false} },
      ]
    });

    data
    .then(result =>
      {
        const game = {
          id: 'e5834d8e-5195-41fc-993e-c731dbce4fab',
          name: "Pedro",
        }
        res.json(game);
      })
    
  } catch (error) {
    res.status(500).json({message: error.message,
    stack: error.stack}); 
  }
});

module.exports = router;
