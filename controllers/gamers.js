const express = require('express');
const router = express.Router();

router.get('/gamers', async (req, res, next) => {

    const answer = {
        id: "fffff-ggg-jjjjj",
        type: "",
        gamer1: "Raul Andres",
        gamer2: "Pedro",
        gamer3: "Juan",
    };
    res.json(answer);
});

module.exports = router;