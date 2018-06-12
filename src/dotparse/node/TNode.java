/* This file was generated by SableCC (http://www.sablecc.org/). */

package dotparse.node;

import dotparse.analysis.*;

@SuppressWarnings("nls")
public final class TNode extends Token
{
    public TNode()
    {
        super.setText("node");
    }

    public TNode(int line, int pos)
    {
        super.setText("node");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNode(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNode(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNode text.");
    }
}
