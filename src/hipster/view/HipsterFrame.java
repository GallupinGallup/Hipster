package hipster.view;

import hipster.controller.HipsterController;

import java.awt.Dimension;

import javax.swing.JFrame;

public class HipsterFrame extends JFrame
{
	
	private HipsterController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Hipsters 2016");
		this.setSize(new Dimension(600,400));
		this.setResizable(false);
		this.setVisible(true);
	}
}
