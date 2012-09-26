package org.culturegraph.metaflow;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author "Markus Michael Geipel"
 * @deprecated unfinished and not used
 */
@Deprecated
public final class MetaflowGui extends JFrame {

	private final JButton openButton;
	private final JButton runButton;
	private final JFileChooser fileChooser = new JFileChooser();
	private final JTextArea textArea = new JTextArea();

	public MetaflowGui() {
		super("Metaflow GUI");
		setSize(800, 625);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final Container pane = getContentPane();
		final FlowLayout flo = new FlowLayout();
		pane.setLayout(flo);

		openButton = new JButton("open flow file");
		openButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				final int returnVal = fileChooser.showOpenDialog(MetaflowGui.this);

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					final File file = fileChooser.getSelectedFile();
					try {
						textArea.setText(readFile(file));
						//final CommonTreeNodeStream ast = Metaflow.compileAst(new FileInputStream(file));
						
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});

		pane.add(openButton);

		runButton = new JButton("run");
		pane.add(runButton);

		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		JScrollPane areaScrollPane = new JScrollPane(textArea);
		areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		areaScrollPane.setPreferredSize(new Dimension(250, 250));
		pane.add(areaScrollPane);

		setVisible(true);

	}
	
	private static String readFile( final File file ) throws IOException {
	    BufferedReader reader = new BufferedReader( new FileReader (file));
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    while( ( line = reader.readLine() ) != null ) {
	        stringBuilder.append( line );
	        stringBuilder.append( ls );
	    }

	    return stringBuilder.toString();
	}


	public static void main(final String[] args) {
		new MetaflowGui();
	}
}
