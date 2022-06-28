//traer un usuario
const express = require('express');
const router = express.Router();
const Gamer = require('../models/gamer.model');
/* GET users listing. */
router.get('/gamer/:id', async (req, res, next) => {
  try {
    
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

          gamers: {
            result
            },
          inProgress: false,
          winner: {
            name: "",
          }
        }
        res.json(game);
      });

  } catch (error) {
    res.status(500).json({
      message: error.message,
      stack: error.stack
    });
  }
});

module.exports = router;
