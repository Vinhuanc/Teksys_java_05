// Have three variables, no need to do anything with the variables. Confirmed with Kevin.
let recomCity = document.getElementById("userInputCity").value;
let recomCountry = document.getElementById("userInputCountry").value;
let recomContinent = document.getElementById("userInputContinent").value;
console.log("Your suggestions:");
console.log("Recommended City: " + recomCity);
console.log("Recommended Country: " + recomCountry);
console.log("Recommended Continent: " + recomContinent);

// Have 5 functions, fits the JavaScript function requirement
//Don't need to do the callback, as the JavaScript requirement is callback/functions
function alertbox() {
  alert("Successfully submitted!");
}

function pickBlueBox() {
  alert("You choose the color blue! You should visit Hallstatt, Austria!");
}

function pickGreenBox() {
  alert("You choose the color green! You should visit Mostar, Bosnia!");
}

function pickPinkBox() {
  alert("You choose the color pink! You should visit Bali, Indonesia!");
}

function pickPurpleBox() {
  alert("You choose the color purple! You should visit Santorini, Greence!");
}

// have a if statement, fits the JavaScript if statement requirement
function beginningQuestion() {
  let userAnswer = prompt("Do you like to travel?");
  if(userAnswer !== "yes"){
      console.log("Maybe visit another website, as this website is for travel lovers!")
  }else
  if (userAnswer = "yes" ) {
    console.log("Yahhh, continue with this page!")
  }
}
// have a Collection, fits the JavaScript collection requirement
var vocationCollection = new Map();
vocationCollection.set('city', 'Bali');
vocationCollection.set('Country', 'Indonesia');
vocationCollection.set('city', 'Santorini');
vocationCollection.set('Country', 'Greece');
vocationCollection.set('city', 'Hallstatt');
vocationCollection.set('Country', 'Austria');
vocationCollection.set('city', 'Mostar');
vocationCollection.set('Country', 'Bosnia');

