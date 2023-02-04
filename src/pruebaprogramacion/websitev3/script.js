// Obtener todos los elementos con la clase "nav-item"
const navItems = document.querySelectorAll('.nav-item');

// Iterar sobre cada elemento y agregar un evento click
navItems.forEach(item => {
  item.addEventListener('click', event => {
    // Eliminar la clase "active" de todos los elementos
    navItems.forEach(item => item.classList.remove('active'));
    // Agregar la clase "active" al elemento clickeado
    event.target.classList.add('active');
  });
});
