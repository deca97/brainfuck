import org.antlr.v4.runtime.Token;

import javax.swing.*;
import java.util.Arrays;

public class Interpreter extends gramBaseVisitor{

    private final Integer[] buffer = new Integer[100];
    private int index = 0;

    public Interpreter(){

        for(int i = 0; i < buffer.length; i++)
            buffer[i] = 0;
    }

    @Override
    public Integer visitPlus(gramParser.PlusContext ctx) {
        ++buffer[index];
        //System.out.println("Value on the pointer ["+ index + "]: " + buffer[index]);
        return buffer[index];
    }

    @Override
    public Integer visitMinus(gramParser.MinusContext ctx){
        --buffer[index];
        //System.out.println("Value on the pointer ["+ index + "]: " + buffer[index]);
        return buffer[index];
    }

    @Override
    public Integer visitRightpointer(gramParser.RightpointerContext ctx) {
        ++index;
        //System.out.println("Index value " + index);
        return index;
    }

    @Override
    public Integer visitLeftpointer(gramParser.LeftpointerContext ctx) {
        --index;
        //System.out.println("Index value " + index);
        return index;
    }

    @Override
    public Integer visitOperation(gramParser.OperationContext ctx) {
        return (Integer) visit(ctx.opcode());
    }

    @Override
    public Integer visitOutput(gramParser.OutputContext ctx) {
        System.out.println((char) buffer[index].intValue());
        return buffer[index];
    }

    @Override
    public Integer visitInput(gramParser.InputContext ctx) {
        buffer[index] = Integer.parseInt(JOptionPane.showInputDialog("Argomento ["+index+"]"));
        System.out.println(buffer[index]);
        return buffer[index];
    }

    @Override
    public Integer visitLoop(gramParser.LoopContext ctx) {
        while(buffer[index] != 0) {
            ctx.statement().forEach(e -> visit(e));
        }
        return null;
    }
}
