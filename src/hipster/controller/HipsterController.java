package hipster.controller;

import hipster.modle.Hipster;
import hipster.view.HipsterFrame;

public class HipsterController
{
	private HipsterFrame appFrame;
	private int[] numbers;
	private String[] words = {"This ","is the ","second hipster","level: ","Initionalization ","lists"};
	private Hipster[] hipsters;
	
	public HipsterController()
	{
		hipsters = new Hipster[6];
		appFrame = new HipsterFrame(this);
	}
	
	private void thirdLevelHipster()
	{
		numbers = new int [] {0,1,2,3,4,5,6,8,9,0,9,8,7,6,5,4,3,2,1,0};
	}

	public void start()
	{
		for (int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new Hipster("");
		}
		for(Hipster currentHipster : hipsters)
		{
			System.out.println(currentHipster + ", ");
		}
		for(String currentWord : words)
		{
			System.out.println(currentWord + ", ");
		}
		
	}
	public String[] getWords()
	{
		return words;
	}
	public int[] getNumbers()
	{
		return numbers;
	}
	public Hipster[] getHipsters()
	{
		return hipsters;
	}
}
