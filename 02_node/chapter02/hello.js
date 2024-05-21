const user = require('./user');
const user1 = require('./users-1');

const hello = (name) => {
  console.log(`${name} 님 안녕하세요`);
};
module.exports = hello;
// exports.hello = (name) => {
//   console.log(`${name} 님 안녕하세요?`);
// };
