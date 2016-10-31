package btspjpgnothesaplama;

import javax.swing.JOptionPane;

public class BtspJPGNotHesaplama {
  
    public static void main(String[] args) {
        //odev 1 notu set ediliyor
        
        float birinciOdevNotu = setNot((float) 0.1, "1. Ödev Notunu Giriniz");
        float ikinciOdevNotu = setNot((float) 0.1, "2. Ödev Notunu Giriniz");
        float vizeNotu = setNot((float) 0.3, "Vize Notunu Giriniz");
        float finalNotu = setNot((float) 0.5, "Final Notunu Giriniz");
        
        int toplamNot = (int) birinciOdevNotu + (int) ikinciOdevNotu + (int) vizeNotu + (int) finalNotu;
                
        JOptionPane.showMessageDialog(null, "Ödev 1 Notu:"+ (int) birinciOdevNotu);
        JOptionPane.showMessageDialog(null, "Ödev 2 Notu:"+ (int) ikinciOdevNotu);
        JOptionPane.showMessageDialog(null, "Vize Notu:"+ (int) vizeNotu);
        JOptionPane.showMessageDialog(null, "Final Notu:"+ (int) finalNotu);
        JOptionPane.showMessageDialog(null, "Toplam Notunuz:"+ (int) toplamNot);
    }
    
    public static float setNot(float oran, String dialogMetin)
    {
        boolean durum = false;
        int not = 0;
        
        //oran 1'den büyükse 1'e eşitleyelim
        if ( oran > 1 || oran == 0 )
        {
            oran = 1;
        }
        
        //do while döngüsü sayesinde hatalı girilen
        //not oranı tekrar soruluyor.
        do
        {
            String inputNot = JOptionPane.showInputDialog(dialogMetin);
            not = Integer.parseInt(inputNot);
            
            if ( not > 100 )
            {
                JOptionPane.showMessageDialog(null, "Notlar 100'den Fazla Olamaz..!", "HATA", JOptionPane.ERROR_MESSAGE);
                durum = false;
            }
            else
            {
                durum = true;
            }
                    
        }while(durum == false);
        
        //not ile oranı çarparak sonucu gönderiyoruz.
        return oran*not;
    }
}