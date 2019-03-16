import java.io.FileReader;

import antlrGen.riskVLexer;
import antlrGen.riskVParser;
import extraClass.Environment;
import org.antlr.runtime.*;


public class runner {

        static riskVParser parser;
        public static void main(String[] args) {
            CommonTokenStream tokens;
            String fileIn = "./resources/input.file";

            try {
                System.out.println ("----- PARSING STARTED-------");
                riskVLexer lexer = new riskVLexer(new ANTLRReaderStream(new FileReader(fileIn)));
                tokens = new CommonTokenStream(lexer);
                //System.out.print(tokens);
                parser = new riskVParser(tokens);
                parser.start();
                System.out.println("----- PARSING DONE -------");
                parser.getEnv().getErrors();

            } catch (Exception e) {
                System.out.println ("\n#############################\n#  ERROR! PARSING STOPPED!  #\n#############################\n");
                parser.getEnv().getErrors();
                e.printStackTrace();
            }
        }


}
