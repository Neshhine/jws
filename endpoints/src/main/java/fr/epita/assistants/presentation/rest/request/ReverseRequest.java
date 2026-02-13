package fr.epita.assistants.presentation.rest.request;

public class ReverseRequest
{
    public String content;

    public ReverseRequest() {}

    public ReverseRequest(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }
}