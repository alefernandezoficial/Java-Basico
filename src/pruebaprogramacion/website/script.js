const sections = document.querySelectorAll("section");
const menu = document.querySelector("header nav");

for (const section of sections) {
  const link = document.createElement("a");
  link.textContent = section.querySelector("h2").textContent;
  link.href = "#" + section.id;
  menu.appendChild(link);

  section.addEventListener("mouseenter", function () {
    section.style.backgroundColor = "rgba(255, 255, 255, 0.1)";
  });

  section.addEventListener("mouseleave", function () {
    section.style.backgroundColor = "";
  });
}

  const select = document.querySelector("select");
  select.addEventListener("change", function() {
    const selectedOption = this.value;
    const allDetails = document.querySelectorAll("[id$='-details']");
    allDetails.forEach(function(details) {
      details.style.display = "none";
    });
    const selectedDetails = document.getElementById(selectedOption + "-details");
    selectedDetails.style.display = "block";
  });