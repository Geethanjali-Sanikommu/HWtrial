/* This file was generated by SableCC (http://www.sablecc.org/). */

package dotparse.analysis;

import java.util.*;
import dotparse.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADigraphRoot(ADigraphRoot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALinesLine(ALinesLine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrowLine(AArrowLine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATextLine(ATextLine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANodeLine(ANodeLine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEmptyLine(AEmptyLine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdsText(AIdsText node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAListText(AListText node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAElementList(AElementList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEleElements(AEleElements node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACommaElements(ACommaElements node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAssignmentEle(AAssignmentEle node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringEle(AStringEle node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumberEle(ANumberEle node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDigraph(TDigraph node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNode(TNode node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLbrace(TLbrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRbrace(TRbrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLbracket(TLbracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRbracket(TRbracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAssignment(TAssignment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicoln(TSemicoln node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTArrow(TArrow node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhitespace(TWhitespace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEol(TEol node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}