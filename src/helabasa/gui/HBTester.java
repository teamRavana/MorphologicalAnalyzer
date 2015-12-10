/**
 * @author Rajith Priyanga (c) 2013 - rpriyanga@yahoo.com 
 * 
 * 
 */
package helabasa.gui;

import helabasa.HBAnalyzer;
import helabasa.HBCorpus;
import helabasa.HBForm;
import helabasa.HBFormContainer;
import helabasa.HBIrregularForm;
import helabasa.HBPOS;
import helabasa.HBWord;
import helabasa.Helabasa;
import helabasa.sandhi.HBWordJoinRule;
import helabasa.sandhi.HBWordJoiner;
import helabasa.servlets.NounConjugator;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class HBTester {

	public HBTester() {
		// TODO Auto-generated constructor stub
	}

	public static void AnalyzeNoun(String sVal)
	{
		NounConjugator oNC = new NounConjugator();
		PrintWriter oPW = new PrintWriter(System.out, true);
		oNC.PrintResultsTable(oPW, sVal, 0);
	}
	
	
	public static void Analyze(String sWord)
	{
		Helabasa.GetLog().println("=========================\r");
		Helabasa.GetLog().println("Analyzing : " + sWord + "\r");
		Helabasa.GetLog().println("=========================\r");
		HBAnalyzer oAnalyzer = new HBAnalyzer();
		List<HBPOS> lstResults = new ArrayList<HBPOS>();
		oAnalyzer.Analyze(sWord, lstResults);		
		
		//Helabasa.GetLog().println("=========================\r");
		for(int i=0; i<lstResults.size(); i++)
		{
			HBPOS oPos = lstResults.get(i);
			Helabasa.GetLog().println("-------------------------\r");
			oPos.DebugPrint();
			Helabasa.GetLog().println("-------------------------\r");
		}
		
	}
	
	public static void Disjoin(String sWord, String sSuffix)
	{
		Helabasa.GetLog().println("=========================\r");
		Helabasa.GetLog().println("Disjoining : " + sWord + " from " + sSuffix + "\r");
		Helabasa.GetLog().println("=========================\r");

		List<String> lstResults = new ArrayList<String>();
		HBWordJoiner.Disjoin(sWord, sSuffix,  lstResults, false, 0, HBWordJoiner.JOIN_MODE_UNIVERSAL);	
		
		Helabasa.GetLog().println("=========================\r");
		for(int i=0; i<lstResults.size(); i++)
		{
			Helabasa.GetLog().println((i+1) + " : " + lstResults.get(i) + " + " + sSuffix + " = " + sWord + "\r");
			
		}
		
	}
	
	
	public static void Join(String sLeft, String sRight)
	{
		Helabasa.GetLog().println("=========================\r");
		Helabasa.GetLog().println("Joining : " + sLeft + " and " + sRight);
		Helabasa.GetLog().println("=========================\r");
		
    	//HBWordJoiner oJoiner = new HBWordJoiner();

    	for(int i=HBWordJoinRule.POORWA_SWARA_LOPA; i<=HBWordJoinRule.DVITHWA_ROOPA + 1; i++)
		{
        	List<HBWord> listValues = HBWordJoiner.Join(sLeft, sRight, i, true, 1, HBWordJoiner.JOIN_MODE_UNIVERSAL);
        	int iCount = listValues.size();

    		Helabasa.GetLog().println(HBWordJoinRule.sar_SandhiNames[i]  +" : ");
    	
    		for(int j=0; j<iCount; j++)
    		{
    			if(j==iCount-1)
    			{
    				Helabasa.GetLog().print(listValues.get(j).GetNaturalForm() + " (" + listValues.get(j).GetFrequency() + ")\n\r");
    			}
    			else
    			{
    				Helabasa.GetLog().print(listValues.get(j).GetNaturalForm() + " (" + listValues.get(j).GetFrequency() + "), ");
    			}
    		}
		}  
    	
	}
	
	
	public static void TestFormContainer()
	{
		HBFormContainer oForms = new HBFormContainer();
		HBForm oF00 = new HBIrregularForm("00", "00", (short)0, (short)0);
		HBForm oF01 = new HBIrregularForm("01", "01", (short)0, (short)1);
		HBForm oF02 = new HBIrregularForm("02", "02", (short)0, (short)2);
		HBForm oF10 = new HBIrregularForm("10", "10", (short)1, (short)0);
		HBForm oF11 = new HBIrregularForm("11", "11", (short)1, (short)1);
		HBForm oF12 = new HBIrregularForm("12", "12", (short)1, (short)2);		
		
		oForms.AddForm(0,  0, oF00);
		oForms.AddForm(0,  1, oF01);
		oForms.AddForm(0,  2, oF02);
		
		oForms.AddForm(1,  0, oF10);
		oForms.AddForm(1,  1, oF11);
		oForms.AddForm(1,  2, oF12);	
		
		List<HBForm> lst = oForms.GetForms(0, 0);
		lst.get(0).DebugPrint();
		
		lst = oForms.GetForms(0, 1);
		lst.get(0).DebugPrint();
		
		lst = oForms.GetForms(0, 2);
		lst.get(0).DebugPrint();

		lst = oForms.GetForms(1, 0);
		lst.get(0).DebugPrint();
		
		lst = oForms.GetForms(1, 1);
		lst.get(0).DebugPrint();
		
		lst = oForms.GetForms(1, 2);
		lst.get(0).DebugPrint();
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Starting Test ...");

		HBCorpus.b_Offline = true;
		Helabasa.Init();
		Helabasa.SetLog(new PrintWriter(System.out, true));
		
		//	TestFormContainer();
		
		//Analyze("මිනිස්");
		
		//AnalyzeNoun("කමල");
		//Analyze("මිනිසෙක්");
		
		//Analyze("මිනිස්සු");
		
		//Analyze("උකුසු");
		
		//Analyze("තරුණිය");
		AnalyzeNoun("කමල්");
				
		
		//Disjoin("ගැහැණිය",  "ය");
		//Disjoin("මිනිසෙක්",  "එක්");
		
		//Analyze("මිනිසා");
		
		//Join("මිනිස්", "ආ");
		
//		Sandhi s = new Sandhi();
//		PrintWriter out = new PrintWriter(System.out);
//		s.PrintResultsTable(out, "බලු", "ආ", "1");
//		out.flush();
	}

}
