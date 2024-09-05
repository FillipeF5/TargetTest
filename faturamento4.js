// Valores de faturamento mensal por estado
const faturamento = {
    'SP': 67836.43,
    'RJ': 36678.66,
    'MG': 29229.88,
    'ES': 27165.48,
    'Outros': 19849.53
};

// Calcula o faturamento total
const faturamentoTotal = Object.values(faturamento).reduce((acc, valor) => acc + valor, 0);

// Função para calcular o percentual
function calcularPercentual(faturamentoEstado, faturamentoTotal) {
    return (faturamentoEstado / faturamentoTotal) * 100;
}

// Exibe o percentual de cada estado
for (const estado in faturamento) {
    const percentual = calcularPercentual(faturamento[estado], faturamentoTotal);
    console.log(`${estado}: ${percentual.toFixed(2)}%`);
}