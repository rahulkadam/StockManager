import * as mortgage from './mortages';
let {monthlyPayment, monthlyRate, amortization} =
    mortgage.calculateAmortization(principal, years, rate);