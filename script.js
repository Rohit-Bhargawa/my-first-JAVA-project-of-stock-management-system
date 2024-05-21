// Get the form element
const form = document.querySelector('.login-form');

// Add an event listener for form submission
form.addEventListener('submit', (event) => {
  // Prevent the default form submission behavior
  event.preventDefault();

  // Get the username and password input fields
  const username = document.querySelector('#username');

  // Check if the username and password are valid
  if (username.value === 'rohit') {
    // Redirect the user to the stock management system
    window.location.href = 'dashboard.html';
  } else {
    // Display an error message
    alert('Invalid username or password');
  }
});