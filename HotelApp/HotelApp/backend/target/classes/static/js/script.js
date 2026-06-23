// Common JS utilities for Hotel Management System

function checkAuth() {
    const user = localStorage.getItem('user');
    if (!user && !window.location.pathname.endsWith('index.html') && !window.location.pathname.endsWith('register.html')) {
        window.location.href = '../index.html';
    }
}

// Auto check auth on load
document.addEventListener('DOMContentLoaded', checkAuth);
