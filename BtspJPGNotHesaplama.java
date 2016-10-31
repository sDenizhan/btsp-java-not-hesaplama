package btspjpgnothesaplama;

import javax.swing.JOptionPane;

public class BtspJPGNotHesaplama {
  
    public static void main(String[] args) {
        //odev 1 notu set ediliyor
        
        int birinciOdevNotu = setNot((float) 0.1, "1. Ödev Notunu Giriniz");
        int ikinciOdevNotu = setNot((float) 0.1, "2. Ödev Notunu Giriniz");
        int vizeNotu = setNot((float) 0.3, "Vize Notunu Giriniz");
        int finalNotu = setNot((float) 0.5, "Final Notunu Giriniz");
        
        int toplamNot = birinciOdevNotu + ikinciOdevNotu + vizeNotu + finalNotu;
                
        JOptionPane.showMessageDialog(null, "Ödev 1 Notu:"+ birinciOdevNotu);
        JOptionPane.showMessageDialog(null, "Ödev 2 Notu:"+ ikinciOdevNotu);
        JOptionPane.showMessageDialog(null, "Vize Notu:"+ vizeNotu);
        JOptionPane.showMessageDialog(null, "Final Notu:"+ finalNotu);
        JOptionPane.showMessageDialog(null, "Toplam Notunuz:"+ toplamNot);
    }
    
    public static int setNot(float oran, String dialogMetin)
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
        return (int) (oran*not);
    }
}
