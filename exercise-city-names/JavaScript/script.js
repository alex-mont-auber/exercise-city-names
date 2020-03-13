
// START FASE 1

var VarCity1 = prompt("Write 6 cities, first city:"),
    VarCity2 = prompt("Next city:"), 
    VarCity3 = prompt("Next city:"),  
    VarCity4 = prompt("Next city:"), 
    VarCity5 = prompt("Next city:"), 
    VarCity6 = prompt("Last city:");

    console.log("Cities list: " + VarCity1 + ", "
                                + VarCity2 + ", "
                                + VarCity3 + ", "
                                + VarCity4 + ", "
                                + VarCity5 + ", "
                                + VarCity6 + ".");

// END FASE 1

// START FASE 2

var ArrayCities = [ VarCity1, VarCity2, VarCity3, VarCity4, VarCity5, VarCity6 ];

console.log("Array de cities: " + ArrayCities);

ArrayCities.sort();

console.log("Array of cities alphabetically ordered: " + ArrayCities);

// END FASE 2

// START FASE 3

var ModifiedArrayCities = [];

for(let e = 0; e < ArrayCities.length; e++){
    let i;
    i = ArrayCities[e].split("a").join("4");
    ModifiedArrayCities.push(i);
}

console.log("Modified cities ordened: " + ModifiedArrayCities);

// END FASE 3

// START FASE 4

var ArrayXCity1 = [];
var ArrayXCity2 = [];
var ArrayXCity3 = [];
var ArrayXCity4 = [];
var ArrayXCity5 = [];
var ArrayXCity6 = [];

var GroupCitiesArray = [ ArrayXCity1,
                         ArrayXCity2,
                         ArrayXCity3,
                         ArrayXCity4,
                         ArrayXCity5,
                         ArrayXCity6 ];

for(let e = 0; e < ArrayCities.length; e++){
    for(let i = 0; i < GroupCitiesArray.length; i++){
        if(e === i){
            GroupCitiesArray[i].push(ArrayCities[e]); 
        }
    }
}


// The next loop, apart of letter's separation, and reverse position, with conditionals will try to put one or another comment depending of e's index.

for(let e = 0; e < GroupCitiesArray.length; e++){
    for(let i = 0; i < GroupCitiesArray[e].length; i++){
        var outputNormal = GroupCitiesArray[e][i].split("");
        var outputReverse = GroupCitiesArray[e][i].split("").reverse(); 
        if(e === 0){
            console.log("First city: [ " + outputNormal + " ] and reversed name: [ " + outputReverse + " ]");
        } else if(e!== 0 && e < GroupCitiesArray.length - 1) {
            console.log("Next city: [ " + outputNormal + " ] and reversed name: [ " + outputReverse + " ]");
        } else {
            console.log("Last city: [ " + outputNormal + " ] and reversed name: [ " + outputReverse + " ]")
        }
    } 
}

// END FASE 4