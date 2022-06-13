var express = require('express');
var router = express.Router();

/* GET users listing. */
router.get('/', function(req, res, next) {
    const answer = {
        message : "Hello world",
    };
 res.json(answer);
});

module.exports = router;
