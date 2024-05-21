const path = require('path');

const full = path.join('some', 'work  ', 'ex.txt  ');

console.log(full);
console.log(`파일 절대 경로 : ${__filename}`);
const dir = path.dirname(__filename);
console.log(`dirctory : ${dir}}`);

const ext = path.extname(__filename);
console.log(`파일 확장자 ${ext}`);
console.log(path.basename(__filename, ext));

const parsedpath = path.parse(__filename);
console.log(parsedpath);
