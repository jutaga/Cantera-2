//traer un usuario
const express = require('express');
const router = express.Router();
const User = require('../models/gamer.model');
/* GET users listing. */
router.get('/gamer/:id', async (req, res, next) => {
  try {
    //const user = await User.findById({_id: req.params.id});   
    const data = await User.findById( req.params.id );   
    if(data){
      res.json({ data })
    }else { 
      res.status(404).json({data: 'gamer not found'});
    }
    
  } catch (error) {
    res.status(500).json({
      message: error.message,
      stack: error.stack
    });
  }
});


module.exports = router;
