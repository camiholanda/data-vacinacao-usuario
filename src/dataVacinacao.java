import javax.swing. JOptionPane;
public class dataVacinacao {
    public static void main(String[] args) {
        // All the code application logic here
        String nome;
        int idade;
      
            JOptionPane.showMessageDialog(null, "Para saber o dia que você irá se vacinar, digite as informações da próxima tela");
            nome = JOptionPane.showInputDialog(" Digite seu nome:");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
            
           if (idade >=80 && idade <= 85){JOptionPane.showMessageDialog(null, "Segunda");}
                 else if (idade >= 75 && idade <= 79)
                       {JOptionPane.showMessageDialog(null, "Terça - feira");}
                            else if (idade >= 70 &&  idade < 75)
                                {JOptionPane.showMessageDialog(null, "Quarta -  feira ");}
                                    else if( idade >= 60 && idade <= 69)
                                        {JOptionPane.showMessageDialog(null, "Quinta - feira ");}
                                            else
                                                {JOptionPane.showMessageDialog(null, "Fora do período de vacinação");}
               
            
            }
               
                      
                      
                      
                      
          
        
       
    }
    
}
