// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = 'Nunito', '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#858796';

// Pie Chart Example
var ctx = document.getElementById("myPieChart");
var myPieChart = new Chart(ctx, {
  type: 'doughnut',
  data: {
    labels: ["Piso 1", "Piso 2", "Piso 3", "Piso 4", "Piso 5", "Piso 6", "Piso 7", "Piso 8", "Piso 10"],
    datasets: [{
      //Data por piso en orden ascendente
      data: [55, 30, 15, 35, 40, 26, 34, 30, 45],
      //Esquema de colores por orden
      backgroundColor: ['#4e73df', '#1cc88a', '#36b9cc', "#7B113E", "#D39755", "#162D61", "#1A2164", "#D3C555", "#653700"],
      //Esquema de colores al estar encima
      hoverBackgroundColor: ['#2e59d9', '#17a673', '#2c9faf', "#560024", "#905514", "#071944", "#090F46", "#908214", "#905814"],
      hoverBorderColor: "rgba(234, 236, 244, 1)",
    }],
  },
  options: {
    maintainAspectRatio: false,
    tooltips: {
      backgroundColor: "rgb(255,255,255)",
      bodyFontColor: "#858796",
      borderColor: '#dddfeb',
      borderWidth: 1,
      xPadding: 15,
      yPadding: 15,
      displayColors: false,
      caretPadding: 10,
    },
    legend: {
      display: false
    },
    cutoutPercentage: 80,
  },
});
