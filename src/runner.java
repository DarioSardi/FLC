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
                System.out.println ("----- INIZIO PARSING -------");
                riskVLexer lexer = new riskVLexer(new ANTLRReaderStream(new FileReader(fileIn)));
                tokens = new CommonTokenStream(lexer);
                //System.out.print(tokens);
                parser = new riskVParser(tokens);
                parser.start();
                System.out.println("----- FINE PARSING -------");
                parser.getEnv().getErrors();

            } catch (Exception e) {
                System.out.println ("\n#############################\n#ERRORE! PARSING INTERROTTO!#\n#############################\n");
                parser.getEnv().getErrors();
                e.printStackTrace();
            }
        }


}
