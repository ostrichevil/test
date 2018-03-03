package demo.FpGrowth;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class TestFPGrowth {
    public List<List<String>> readTransRecords(String file){
        List<List<String>> transRecord=new LinkedList<List<String>>();
        try {
            BufferedReader bf=new BufferedReader(new FileReader(file));
            String line;
            List<String> record;
            while((line=bf.readLine())!=null){
                if(line.trim().length()>0){
                    // System.out.println(line);
                    String[] str=line.split(" ");
//          for(int i=0;i<str.length;i++){
//          System.out.print(str[i]+" ");
//          }
                    record=new LinkedList<String>();
                    for(String string:str){
                        record.add(string);
                    }
                    transRecord.add(record);
                }
            }

        }

        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return transRecord;
    }

    public static void main(String[] args) {
        FPGrowth fpGrowth=new FPGrowth();
        fpGrowth.setMinSupport(3);
        TestFPGrowth res=new TestFPGrowth();
        String file="F:\\FPGrowth\\record.txt";
        List<List<String>> transRecords=res.readTransRecords(file);
    /*for(int i=0;i<transRecords.size();i++){
        for(int j=0;j<transRecords.get(i).size();j++){
        System.out.print(transRecords.get(i).get(j)+" ");
        }
        System.out.println();
    }*/
        ArrayList<FP_TreeNode> list=fpGrowth.buildHeaderTable(transRecords);

    /*for(int i=0;i<list.size();i++){
        System.out.print(list.get(i).getNodeName()+" ");
    }*/
        fpGrowth.FPGrowth(transRecords, null);
    }


}
