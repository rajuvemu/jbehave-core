/* This file was generated by SableCC (http://www.sablecc.org/). */

package jbehave.story.codegen.sablecc.node;

import jbehave.story.codegen.sablecc.analysis.Analysis;

public final class AScenario extends PScenario
{
    private PScenarioTitle _scenarioTitle_;

    public AScenario()
    {
    }

    public AScenario(
        PScenarioTitle _scenarioTitle_)
    {
        setScenarioTitle(_scenarioTitle_);

    }
    public Object clone()
    {
        return new AScenario(
            (PScenarioTitle) cloneNode(_scenarioTitle_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAScenario(this);
    }

    public PScenarioTitle getScenarioTitle()
    {
        return _scenarioTitle_;
    }

    public void setScenarioTitle(PScenarioTitle node)
    {
        if(_scenarioTitle_ != null)
        {
            _scenarioTitle_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _scenarioTitle_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_scenarioTitle_);
    }

    void removeChild(Node child)
    {
        if(_scenarioTitle_ == child)
        {
            _scenarioTitle_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_scenarioTitle_ == oldChild)
        {
            setScenarioTitle((PScenarioTitle) newChild);
            return;
        }

    }
}
