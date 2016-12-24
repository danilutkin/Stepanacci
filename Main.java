public class Main {

    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);
        //System.out.println("Введите роли:");
       //String[] roles  = new String[];

        String[] roles = {"Городничий","Аммос Федорович","Артемий Филиппович","Лука Лукич","Олег Петрович"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.","Данил Михайлович: в этот раз уж должно было получиться...","Аммос Федорович: Как ревизор?","Артемий Филиппович: Как ревизор?","Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.","Аммос Федорович: Вот те на!","Артемий Филиппович: Вот не было заботы, так подай!","Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        StringBuilder preScenario = new StringBuilder();
        String[] repbyrole = new String[50000];
        for (String i:roles) {

            //System.out.println(i+":");
            preScenario.append(i+":"+"\n");

            for (int j=0;j<textLines.length;j++){
                if(textLines[j].startsWith(i+":")){
                    repbyrole[j] = textLines[j].replaceFirst("^" + i + ":", j + 1 + ")");
                    preScenario.append(repbyrole[j] + "\n");
                }else{
                    continue;
                }
            }
            preScenario.append("\n");
        }
    String Scenario = preScenario.toString();
        System.out.println(Scenario);
        //return Scenario;
    }



}


