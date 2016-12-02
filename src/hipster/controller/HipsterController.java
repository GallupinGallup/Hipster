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
		for (int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new Hipster("hipster # " + index);
		}

		appFrame = new HipsterFrame(this);
	}
	
	private void thirdLevelHipster()
	{
		numbers = new int [5];
	}

	public void start()
	{
		
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
