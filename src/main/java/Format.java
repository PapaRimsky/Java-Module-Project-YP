public class Format {
    String line="";
    String ruble(float numb){
        int i = (int)numb;
        if(i%100>=11 && i%100<15){
            line="рублей";
        }else{
            if(i%10==0){
                line="рублей";
            }else if(i%10==1){
                line="рубль";
            }else if(i%10<5){
                line="рубля";
            }else{
                line="рублей";
            }
        }
        return line;
    }
    String price(float numb){
        String template = "%.2f";
        return String.format(template, numb);
    }
}
