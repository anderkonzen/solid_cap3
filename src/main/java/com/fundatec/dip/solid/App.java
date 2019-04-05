package com.fundatec.dip.solid;

public class App 
{
    public static void main( String[] args )
    {
    	EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();
    	NotaFiscalDao dao = new NotaFiscalDao();
    	
    	GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(enviadorDeEmail, dao);
    	Fatura fatura = new Fatura(100.00);
    	NotaFiscal nota = gerador.gera(fatura);
    }
}
