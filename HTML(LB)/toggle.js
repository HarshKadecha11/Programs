let a = document.querySelector("#btn");
let b = document.querySelector("#btn2");

let x = "aqua";
let y = "aqua";

a.addEventListener("mouseover", () => {
    if (x === "aqua") {
        document.querySelector("#harsh").style.backgroundColor = "red";
        x = "red";
    } else {
        document.querySelector("#harsh").style.backgroundColor = "aqua";
        x = "aqua";
    }
});

b.addEventListener("mouseover", () => {
    let abhayElement = document.querySelector("#abhay");
    if (y === "aqua") {
        abhayElement.style.backgroundColor = "red";
        abhayElement.style.textTransform = "uppercase";
        y = "red";
    } else {
        abhayElement.style.backgroundColor = "aqua";
        abhayElement.style.textTransform = "none";
        y = "aqua";
    }
});