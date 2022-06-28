const express = require('express');
const router = express.Router();

router.get('/', async (req, res, next) => {
res.render("creategame", {title: "Express"})
});

module.exports = router;