const fs = require('fs');
const data = fs.readFileSync('C:kb_fullstack\02_nodechapter03sec03example.txt');
fs.writeFileSync('./text-1.txt', data);
