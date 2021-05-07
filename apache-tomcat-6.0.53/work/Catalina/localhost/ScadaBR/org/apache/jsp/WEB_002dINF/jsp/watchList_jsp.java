package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.mango.Common;
import com.serotonin.mango.view.ShareUser;

public final class watchList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("sst:escapeLessThan", com.serotonin.web.taglib.Functions.class, "escapeLessThan", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(14);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tld/mango.tld");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/menuItem.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/sharedUsers.tag");
    _jspx_dependants.add("/WEB-INF/tags/dateRange.tag");
    _jspx_dependants.add("/WEB-INF/tags/monthOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/dayOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/hourOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/minuteOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/secondOptions.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fonmouseover_005fonchange_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fonmouseover_005fonchange_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fonmouseover_005fonchange_005fid.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  tag:page
      org.apache.jsp.tag.web.page_tag _jspx_th_tag_005fpage_005f0 = new org.apache.jsp.tag.web.page_tag();
      org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fpage_005f0);
      _jspx_th_tag_005fpage_005f0.setJspContext(_jspx_page_context);
      // /WEB-INF/jsp/watchList.jsp(22,0) name = dwr type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tag_005fpage_005f0.setDwr("WatchListDwr");
      // /WEB-INF/jsp/watchList.jsp(22,0) name = js type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tag_005fpage_005f0.setJs("view");
      // /WEB-INF/jsp/watchList.jsp(22,0) name = onload type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tag_005fpage_005f0.setOnload("init");
      javax.servlet.jsp.tagext.JspFragment _jspx_temp0 = new Helper( 0, _jspx_page_context, _jspx_th_tag_005fpage_005f0, null);
      // /WEB-INF/jsp/watchList.jsp(22,0) null
      _jspx_th_tag_005fpage_005f0.setStyles(_jspx_temp0);
      _jspx_th_tag_005fpage_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_tag_005fpage_005f0, null));
      _jspx_th_tag_005fpage_005f0.doTag();
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fpage_005f0);
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f0_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/watchList.jsp(130,94) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f0.setKey("watchlist.addToWatchlist");
      int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      _jspx_th_fmt_005fmessage_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f0, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f1_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/watchList.jsp(431,15) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f1.setKey("watchlist.noExportables");
      int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      _jspx_th_fmt_005fmessage_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f1, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f2_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/watchList.jsp(466,35) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f2.setKey("watchlist.points");
      int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f2);
      _jspx_th_fmt_005fmessage_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f2, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fhelp_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_005fhelp_005f0 = new org.apache.jsp.tag.web.help_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f0);
    _jspx_th_tag_005fhelp_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fhelp_005f0.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(466,80) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fhelp_005f0.setId("watchListPoints");
    _jspx_th_tag_005fhelp_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f3_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/watchList.jsp(473,37) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f3.setKey("watchlist.watchlist");
      int _jspx_eval_fmt_005fmessage_005f3 = _jspx_th_fmt_005fmessage_005f3.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f3);
      _jspx_th_fmt_005fmessage_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f3, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fhelp_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_005fhelp_005f1 = new org.apache.jsp.tag.web.help_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f1);
    _jspx_th_tag_005fhelp_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fhelp_005f1.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(473,78) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fhelp_005f1.setId("watchList");
    _jspx_th_tag_005fhelp_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f1);
    return false;
  }

  private boolean _jspx_meth_sst_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_005fselect_005f0 = (com.serotonin.web.taglib.SelectTag) _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fonmouseover_005fonchange_005fid.get(com.serotonin.web.taglib.SelectTag.class);
    boolean _jspx_th_sst_005fselect_005f0_reused = false;
    try {
      _jspx_th_sst_005fselect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sst_005fselect_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/watchList.jsp(475,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f0.setId("watchListSelect");
      // /WEB-INF/jsp/watchList.jsp(475,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${selectedWatchList}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/watchList.jsp(475,16) name = onchange type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f0.setOnchange("watchListChanged()");
      // /WEB-INF/jsp/watchList.jsp(475,16) name = onmouseover type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005fselect_005f0.setOnmouseover("closeLayers();");
      int _jspx_eval_sst_005fselect_005f0 = _jspx_th_sst_005fselect_005f0.doStartTag();
      if (_jspx_eval_sst_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                  ");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_sst_005fselect_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_sst_005fselect_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_sst_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005fselect_0026_005fvalue_005fonmouseover_005fonchange_005fid.reuse(_jspx_th_sst_005fselect_005f0);
      _jspx_th_sst_005fselect_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005fselect_005f0, _jsp_annotationprocessor, _jspx_th_sst_005fselect_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_005fselect_005f0);
      // /WEB-INF/jsp/watchList.jsp(477,18) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${watchLists}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/watchList.jsp(477,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("wl");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    ");
            if (_jspx_meth_sst_005foption_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("                  ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_annotationprocessor, _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sst_005foption_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_005foption_005f0 = (com.serotonin.web.taglib.OptionTag) _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue.get(com.serotonin.web.taglib.OptionTag.class);
    boolean _jspx_th_sst_005foption_005f0_reused = false;
    try {
      _jspx_th_sst_005foption_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sst_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/jsp/watchList.jsp(478,20) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sst_005foption_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${wl.key}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      int _jspx_eval_sst_005foption_005f0 = _jspx_th_sst_005foption_005f0.doStartTag();
      if (_jspx_eval_sst_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sst_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          _jspx_push_body_count_c_005fforEach_005f0[0]++;
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_sst_005foption_005f0);
        }
        do {
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sst:escapeLessThan(wl.value)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
          int evalDoAfterBody = _jspx_th_sst_005foption_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sst_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_c_005fforEach_005f0[0]--;
        }
      }
      if (_jspx_th_sst_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005fsst_005foption_0026_005fvalue.reuse(_jspx_th_sst_005foption_005f0);
      _jspx_th_sst_005foption_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sst_005foption_005f0, _jsp_annotationprocessor, _jspx_th_sst_005foption_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f0 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
    _jspx_th_tag_005fimg_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f0.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(483,18) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setId("wlEditImg");
    // /WEB-INF/jsp/watchList.jsp(483,18) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setPng("pencil");
    // /WEB-INF/jsp/watchList.jsp(483,18) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f0.setTitle("watchlist.editListName");
    _jspx_th_tag_005fimg_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f4_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f4.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/watchList.jsp(486,20) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f4.setKey("watchlist.newListName");
      int _jspx_eval_fmt_005fmessage_005f4 = _jspx_th_fmt_005fmessage_005f4.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
      _jspx_th_fmt_005fmessage_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f4, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f5_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/watchList.jsp(489,92) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f5.setKey("common.save");
      int _jspx_eval_fmt_005fmessage_005f5 = _jspx_th_fmt_005fmessage_005f5.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
      _jspx_th_fmt_005fmessage_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f5, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f1 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f1);
    _jspx_th_tag_005fimg_005f1.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f1.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(494,18) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setPng("user");
    // /WEB-INF/jsp/watchList.jsp(494,18) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setTitle("share.sharing");
    // /WEB-INF/jsp/watchList.jsp(494,18) name = onmouseover type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f1.setOnmouseover("closeLayers();");
    _jspx_th_tag_005fimg_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f1);
    return false;
  }

  private boolean _jspx_meth_tag_005fsharedUsers_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:sharedUsers
    org.apache.jsp.tag.web.sharedUsers_tag _jspx_th_tag_005fsharedUsers_005f0 = new org.apache.jsp.tag.web.sharedUsers_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fsharedUsers_005f0);
    _jspx_th_tag_005fsharedUsers_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fsharedUsers_005f0.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(496,20) name = doxId type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fsharedUsers_005f0.setDoxId("watchListSharing");
    // /WEB-INF/jsp/watchList.jsp(496,20) name = noUsersKey type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fsharedUsers_005f0.setNoUsersKey("share.noWatchlistUsers");
    // /WEB-INF/jsp/watchList.jsp(496,20) name = closeFunction type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fsharedUsers_005f0.setCloseFunction("hideLayer('usersEdit')");
    _jspx_th_tag_005fsharedUsers_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fsharedUsers_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f2 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f2);
    _jspx_th_tag_005fimg_005f2.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f2.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(501,16) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setPng("copy");
    // /WEB-INF/jsp/watchList.jsp(501,16) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setOnclick("addWatchList(true)");
    // /WEB-INF/jsp/watchList.jsp(501,16) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setTitle("watchlist.copyList");
    // /WEB-INF/jsp/watchList.jsp(501,16) name = onmouseover type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f2.setOnmouseover("closeLayers();");
    _jspx_th_tag_005fimg_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f2);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f3 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f3);
    _jspx_th_tag_005fimg_005f3.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f3.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(502,16) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setPng("add");
    // /WEB-INF/jsp/watchList.jsp(502,16) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setOnclick("addWatchList(false)");
    // /WEB-INF/jsp/watchList.jsp(502,16) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setTitle("watchlist.addNewList");
    // /WEB-INF/jsp/watchList.jsp(502,16) name = onmouseover type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f3.setOnmouseover("closeLayers();");
    _jspx_th_tag_005fimg_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f3);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f4 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f4);
    _jspx_th_tag_005fimg_005f4.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f4.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(503,16) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setPng("delete");
    // /WEB-INF/jsp/watchList.jsp(503,16) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setId("watchListDeleteImg");
    // /WEB-INF/jsp/watchList.jsp(503,16) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setOnclick("deleteWatchList()");
    // /WEB-INF/jsp/watchList.jsp(503,16) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setTitle("watchlist.deleteList");
    // /WEB-INF/jsp/watchList.jsp(503,16) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setStyle("display:none;");
    // /WEB-INF/jsp/watchList.jsp(503,16) name = onmouseover type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f4.setOnmouseover("closeLayers();");
    _jspx_th_tag_005fimg_005f4.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f4);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f5 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f5);
    _jspx_th_tag_005fimg_005f5.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f5.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(505,16) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setPng("report_add");
    // /WEB-INF/jsp/watchList.jsp(505,16) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setOnclick("createReport()");
    // /WEB-INF/jsp/watchList.jsp(505,16) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setTitle("watchlist.createReport");
    // /WEB-INF/jsp/watchList.jsp(505,16) name = onmouseover type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f5.setOnmouseover("closeLayers();");
    _jspx_th_tag_005fimg_005f5.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f5);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f6 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f6);
    _jspx_th_tag_005fimg_005f6.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f6.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(522,26) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f6.setPng("hourglass");
    // /WEB-INF/jsp/watchList.jsp(522,26) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f6.setTitle("common.gettingData");
    _jspx_th_tag_005fimg_005f6.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f6);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f7 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f7);
    _jspx_th_tag_005fimg_005f7.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f7.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(528,76) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f7.setPng("hourglass");
    // /WEB-INF/jsp/watchList.jsp(528,76) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f7.setTitle("common.gettingData");
    _jspx_th_tag_005fimg_005f7.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f7);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f6_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f6.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/watchList.jsp(538,35) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f6.setKey("watchlist.consolidatedChart");
      int _jspx_eval_fmt_005fmessage_005f6 = _jspx_th_fmt_005fmessage_005f6.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f6);
      _jspx_th_fmt_005fmessage_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f6, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f8 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f8);
    _jspx_th_tag_005fimg_005f8.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f8.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(539,20) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f8.setPng("icon_comp");
    // /WEB-INF/jsp/watchList.jsp(539,20) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f8.setTitle("watchlist.pointDetails");
    // /WEB-INF/jsp/watchList.jsp(539,20) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f8.setOnclick("window.location='data_point_details.shtm?dpid='+ getMangoId(this)");
    _jspx_th_tag_005fimg_005f8.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f8);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f9 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f9);
    _jspx_th_tag_005fimg_005f9.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f9.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(541,20) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setPng("arrow_up_thin");
    // /WEB-INF/jsp/watchList.jsp(541,20) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setId("p_TEMPLATE_MoveUp");
    // /WEB-INF/jsp/watchList.jsp(541,20) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setTitle("watchlist.moveUp");
    // /WEB-INF/jsp/watchList.jsp(541,20) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setStyle("display:none;");
    // /WEB-INF/jsp/watchList.jsp(541,20) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f9.setOnclick("moveRowUp('p'+ getMangoId(this));");
    _jspx_th_tag_005fimg_005f9.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f9);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f10 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f10);
    _jspx_th_tag_005fimg_005f10.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f10.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(542,73) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f10.setPng("arrow_down_thin");
    // /WEB-INF/jsp/watchList.jsp(542,73) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f10.setId("p_TEMPLATE_MoveDown");
    // /WEB-INF/jsp/watchList.jsp(542,73) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f10.setTitle("watchlist.moveDown");
    // /WEB-INF/jsp/watchList.jsp(542,73) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f10.setStyle("display:none;");
    // /WEB-INF/jsp/watchList.jsp(542,73) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f10.setOnclick("moveRowDown('p'+ getMangoId(this));");
    _jspx_th_tag_005fimg_005f10.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f10);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f11 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f11);
    _jspx_th_tag_005fimg_005f11.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f11.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(545,20) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f11.setId("p_TEMPLATE_Delete");
    // /WEB-INF/jsp/watchList.jsp(545,20) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f11.setPng("bullet_delete");
    // /WEB-INF/jsp/watchList.jsp(545,20) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f11.setTitle("watchlist.delete");
    // /WEB-INF/jsp/watchList.jsp(545,20) name = style type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f11.setStyle("display:none;");
    // /WEB-INF/jsp/watchList.jsp(545,20) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f11.setOnclick("removeFromWatchList(getMangoId(this))");
    _jspx_th_tag_005fimg_005f11.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f11);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f7_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f7.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/watchList.jsp(554,14) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f7.setKey("watchlist.emptyList");
      int _jspx_eval_fmt_005fmessage_005f7 = _jspx_th_fmt_005fmessage_005f7.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f7);
      _jspx_th_fmt_005fmessage_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f7, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    boolean _jspx_th_fmt_005fmessage_005f8_reused = false;
    try {
      _jspx_th_fmt_005fmessage_005f8.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fmessage_005f8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/jsp/watchList.jsp(565,35) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fmessage_005f8.setKey("watchlist.chart");
      int _jspx_eval_fmt_005fmessage_005f8 = _jspx_th_fmt_005fmessage_005f8.doStartTag();
      if (_jspx_th_fmt_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
      _005fjspx_005ftagPool_005ffmt_005fmessage_0026_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f8);
      _jspx_th_fmt_005fmessage_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fmessage_005f8, _jsp_annotationprocessor, _jspx_th_fmt_005fmessage_005f8_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fhelp_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_005fhelp_005f2 = new org.apache.jsp.tag.web.help_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f2);
    _jspx_th_tag_005fhelp_005f2.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fhelp_005f2.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(565,72) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fhelp_005f2.setId("watchListCharts");
    _jspx_th_tag_005fhelp_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fhelp_005f2);
    return false;
  }

  private boolean _jspx_meth_tag_005fdateRange_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:dateRange
    org.apache.jsp.tag.web.dateRange_tag _jspx_th_tag_005fdateRange_005f0 = new org.apache.jsp.tag.web.dateRange_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fdateRange_005f0);
    _jspx_th_tag_005fdateRange_005f0.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fdateRange_005f0.setParent(_jspx_parent);
    _jspx_th_tag_005fdateRange_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fdateRange_005f0);
    return false;
  }

  private boolean _jspx_meth_tag_005fimg_005f12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_005fimg_005f12 = new org.apache.jsp.tag.web.img_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f12);
    _jspx_th_tag_005fimg_005f12.setJspContext(_jspx_page_context);
    _jspx_th_tag_005fimg_005f12.setParent(_jspx_parent);
    // /WEB-INF/jsp/watchList.jsp(568,14) name = id type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f12.setId("imageChartImg");
    // /WEB-INF/jsp/watchList.jsp(568,14) name = png type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f12.setPng("control_play_blue");
    // /WEB-INF/jsp/watchList.jsp(568,14) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f12.setTitle("watchlist.imageChartButton");
    // /WEB-INF/jsp/watchList.jsp(568,14) name = onclick type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tag_005fimg_005f12.setOnclick("getImageChart()");
    _jspx_th_tag_005fimg_005f12.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tag_005fimg_005f12);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("<style>\r\n");
      out.write("    html > body .dojoTreeNodeLabelSelected {\r\n");
      out.write("        background-color: inherit;\r\n");
      out.write("        color: inherit;\r\n");
      out.write("    }\r\n");
      out.write("    .watchListAttr {\r\n");
      out.write("        min-width:600px;\r\n");
      out.write("    }\r\n");
      out.write("    .rowIcons img {\r\n");
      out.write("        padding-right: 3px;\r\n");
      out.write("    }\r\n");
      out.write("    html > body .dojoSplitContainerSizerH {\r\n");
      out.write("        border: 1px solid #FFFFFF;\r\n");
      out.write("        background-color: #39B54A;\r\n");
      out.write("        margin-top:4px;\r\n");
      out.write("        margin-bottom:4px;\r\n");
      out.write("    }\r\n");
      out.write("    .wlComponentMin {\r\n");
      out.write("        top:0px;\r\n");
      out.write("        left:0px;\r\n");
      out.write("        position:relative;\r\n");
      out.write("        margin:0px;\r\n");
      out.write("        padding:0px;\r\n");
      out.write("        width:16px;\r\n");
      out.write("        height:16px;\r\n");
      out.write("    }\r\n");
      out.write("    </style>");
      return;
    }
    public void invoke1( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      dojo.require(\"dojo.widget.SplitContainer\");\r\n");
      out.write("      dojo.require(\"dojo.widget.ContentPane\");\r\n");
      out.write("      mango.view.initWatchlist();\r\n");
      out.write("      mango.share.dwr = WatchListDwr;\r\n");
      out.write("      var owner;\r\n");
      out.write("      var pointNames = {};\r\n");
      out.write("      var watchlistChangeId = 0;\r\n");
      out.write("      \r\n");
      out.write("      function init() {\r\n");
      out.write("          WatchListDwr.init(function(data) {\r\n");
      out.write("              mango.share.users = data.shareUsers;\r\n");
      out.write("              \r\n");
      out.write("              // Create the point tree.\r\n");
      out.write("              var rootFolder = data.pointFolder;\r\n");
      out.write("              var tree = dojo.widget.manager.getWidgetById('tree');\r\n");
      out.write("              var i;\r\n");
      out.write("              \r\n");
      out.write("              for (i=0; i<rootFolder.subfolders.length; i++)\r\n");
      out.write("                  addFolder(rootFolder.subfolders[i], tree);\r\n");
      out.write("              \r\n");
      out.write("              for (i=0; i<rootFolder.points.length; i++)\r\n");
      out.write("                  addPoint(rootFolder.points[i], tree);\r\n");
      out.write("              \r\n");
      out.write("              hide(\"loadingImg\");\r\n");
      out.write("              show(\"treeDiv\");\r\n");
      out.write("              \r\n");
      out.write("              addPointNames(rootFolder);\r\n");
      out.write("              \r\n");
      out.write("              // Add default points.\r\n");
      out.write("              displayWatchList(data.selectedWatchList);\r\n");
      out.write("              maybeDisplayDeleteImg();\r\n");
      out.write("          });\r\n");
      out.write("          WatchListDwr.getDateRangeDefaults(");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      boolean _jspx_th_c_005fout_005f0_reused = false;
      try {
        _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fout_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
        // /WEB-INF/jsp/watchList.jsp(87,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fout_005f0.setValue( Common.TimePeriods.DAYS );
        int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
        if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
        _jspx_th_c_005fout_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_annotationprocessor, _jspx_th_c_005fout_005f0_reused);
      }
      out.write(", 1, function(data) { setDateRange(data); });\r\n");
      out.write("          var handler = new TreeClickHandler();\r\n");
      out.write("          dojo.event.topic.subscribe(\"tree/titleClick\", handler, 'titleClick');\r\n");
      out.write("          dojo.event.topic.subscribe(\"tree/expand\", handler, 'expand');\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function addPointNames(folder) {\r\n");
      out.write("          var i;\r\n");
      out.write("          for (i=0; i<folder.points.length; i++)\r\n");
      out.write("              pointNames[folder.points[i].key] = folder.points[i].value;\r\n");
      out.write("          for (i=0; i<folder.subfolders.length; i++)\r\n");
      out.write("              addPointNames(folder.subfolders[i]);\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function addFolder(folder, parent) {\r\n");
      out.write("          var folderNode = dojo.widget.createWidget(\"TreeNode\", {\r\n");
      out.write("                  title: \"<img src='images/folder_brick.png'/> \"+ folder.name,\r\n");
      out.write("                  isFolder: \"true\",\r\n");
      out.write("                  lazyLoadData: folder\r\n");
      out.write("          });\r\n");
      out.write("          parent.addChild(folderNode);\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function populateFolder(folderNode, lazyLoadData) {\r\n");
      out.write("          // Turn this off so as not to confuse the tree node.\r\n");
      out.write("          folderNode.isExpanded = false;\r\n");
      out.write("          \r\n");
      out.write("          var i;\r\n");
      out.write("          for (i=0; i<lazyLoadData.subfolders.length; i++)\r\n");
      out.write("              addFolder(lazyLoadData.subfolders[i], folderNode);\r\n");
      out.write("          \r\n");
      out.write("          for (i=0; i<lazyLoadData.points.length; i++) {\r\n");
      out.write("              addPoint(lazyLoadData.points[i], folderNode);\r\n");
      out.write("              if ($(\"p\"+ lazyLoadData.points[i].key))\r\n");
      out.write("                  togglePointTreeIcon(lazyLoadData.points[i].key, false);\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          folderNode.expand();\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function addPoint(point, parent) {\r\n");
      out.write("          var pointNode = dojo.widget.createWidget(\"TreeNode\", {\r\n");
      out.write("                  title: \"<img src='images/icon_comp.png'/> <span id='ph\"+ point.key +\"Name'>\"+ point.value +\"</span> \"+\r\n");
      out.write("                          \"<img src='images/bullet_go.png' id='ph\"+ point.key +\"Image' title='");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("'/>\",\r\n");
      out.write("                  object: point\r\n");
      out.write("          });\r\n");
      out.write("          parent.addChild(pointNode);\r\n");
      out.write("          $(\"ph\"+ point.key +\"Image\").mangoName = \"pointTreeIcon\";\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      var TreeClickHandler = function() {\r\n");
      out.write("          this.titleClick = function(message) {\r\n");
      out.write("              var widget = message.source;\r\n");
      out.write("              if (!widget.isFolder)\r\n");
      out.write("                  addToWatchList(widget.object.key);\r\n");
      out.write("          },\r\n");
      out.write("          \r\n");
      out.write("          this.expand = function(message) {\r\n");
      out.write("              if (message.source.lazyLoadData) {\r\n");
      out.write("                  var lazyLoadData = message.source.lazyLoadData;\r\n");
      out.write("                  delete message.source.lazyLoadData;\r\n");
      out.write("                  populateFolder(message.source, lazyLoadData);\r\n");
      out.write("              }\r\n");
      out.write("          }\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function displayWatchList(data) {\r\n");
      out.write("          if (!data.points)\r\n");
      out.write("              // Couldn't find the watchlist. Reload the page\r\n");
      out.write("              window.location.reload();\r\n");
      out.write("          \r\n");
      out.write("          var points = data.points;\r\n");
      out.write("          owner = data.access == ");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      boolean _jspx_th_c_005fout_005f1_reused = false;
      try {
        _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
        _jspx_th_c_005fout_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
        // /WEB-INF/jsp/watchList.jsp(159,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fout_005f1.setValue( ShareUser.ACCESS_OWNER );
        int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
        if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
        _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
        _jspx_th_c_005fout_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f1, _jsp_annotationprocessor, _jspx_th_c_005fout_005f1_reused);
      }
      out.write(";\r\n");
      out.write("          \r\n");
      out.write("          // Add the new rows.\r\n");
      out.write("          for (var i=0; i<points.length; i++) {\r\n");
      out.write("              if (!pointNames[points[i]]) {\r\n");
      out.write("                  // The point id isn't in the list. Refresh the page to ensure we have current data.\r\n");
      out.write("                  window.location.reload();\r\n");
      out.write("                  return;\r\n");
      out.write("              }\r\n");
      out.write("              addToWatchListImpl(points[i]);\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          fixRowFormatting();\r\n");
      out.write("          mango.view.watchList.reset();\r\n");
      out.write("          \r\n");
      out.write("          var select = $(\"watchListSelect\");\r\n");
      out.write("          var txt = $(\"newWatchListName\");\r\n");
      out.write("          $set(txt, select.options[select.selectedIndex].text);\r\n");
      out.write("          \r\n");
      out.write("          // Display controls based on access\r\n");
      out.write("          var iconSrc;\r\n");
      out.write("          if (owner) {\r\n");
      out.write("              show(\"wlEditDiv\", \"inline\");\r\n");
      out.write("              show(\"usersEditDiv\", \"inline\");\r\n");
      out.write("              \r\n");
      out.write("              // Set the share users.\r\n");
      out.write("              mango.share.writeSharedUsers(data.users);\r\n");
      out.write("              iconSrc = \"images/bullet_go.png\";\r\n");
      out.write("          }\r\n");
      out.write("          else {\r\n");
      out.write("              hide(\"wlEditDiv\");\r\n");
      out.write("              hide(\"usersEditDiv\");\r\n");
      out.write("              iconSrc = \"images/bullet_key.png\";\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          var icons = getElementsByMangoName($(\"treeDiv\"), \"pointTreeIcon\");\r\n");
      out.write("          for (var i=0; i<icons.length; i++)\r\n");
      out.write("              icons[i].src = iconSrc;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function showWatchListEdit() {\r\n");
      out.write("          openLayer(\"wlEdit\");\r\n");
      out.write("          $(\"newWatchListName\").select();\r\n");
      out.write("      }\r\n");
      out.write("    \r\n");
      out.write("      function saveWatchListName() {\r\n");
      out.write("          var name = $get(\"newWatchListName\");\r\n");
      out.write("          var select = $(\"watchListSelect\");\r\n");
      out.write("          select.options[select.selectedIndex].text = name;\r\n");
      out.write("          WatchListDwr.updateWatchListName(name);\r\n");
      out.write("          hideLayer(\"wlEdit\");\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function watchListChanged() {\r\n");
      out.write("          // Clear the list.\r\n");
      out.write("          var rows = getElementsByMangoName($(\"watchListTable\"), \"watchListRow\");\r\n");
      out.write("          for (var i=0; i<rows.length; i++)\r\n");
      out.write("              removeFromWatchListImpl(rows[i].id.substring(1));\r\n");
      out.write("          \r\n");
      out.write("          watchlistChangeId++;\r\n");
      out.write("          var id = watchlistChangeId;\r\n");
      out.write("          WatchListDwr.setSelectedWatchList($get(\"watchListSelect\"), function(data) {\r\n");
      out.write("        \t  if (id == watchlistChangeId)\r\n");
      out.write("                  displayWatchList(data);\r\n");
      out.write("          });\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function addWatchList(copy) {\r\n");
      out.write("    \t  var copyId = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${NEW_ID}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("    \t  if (copy)\r\n");
      out.write("              copyId = $get(\"watchListSelect\");\r\n");
      out.write("    \t  \r\n");
      out.write("          WatchListDwr.addNewWatchList(copyId, function(watchListData) {\r\n");
      out.write("              var wlselect = $(\"watchListSelect\");\r\n");
      out.write("              wlselect.options[wlselect.options.length] = new Option(watchListData.value, watchListData.key);\r\n");
      out.write("              $set(wlselect, watchListData.key);\r\n");
      out.write("              watchListChanged();\r\n");
      out.write("              maybeDisplayDeleteImg();\r\n");
      out.write("          });\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function deleteWatchList() {\r\n");
      out.write("          var wlselect = $(\"watchListSelect\");\r\n");
      out.write("          var deleteId = $get(wlselect);\r\n");
      out.write("          wlselect.options[wlselect.selectedIndex] = null;\r\n");
      out.write("          \r\n");
      out.write("          watchListChanged();\r\n");
      out.write("          WatchListDwr.deleteWatchList(deleteId);\r\n");
      out.write("          maybeDisplayDeleteImg();\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function maybeDisplayDeleteImg() {\r\n");
      out.write("          var wlselect = $(\"watchListSelect\");\r\n");
      out.write("          display(\"watchListDeleteImg\", wlselect.options.length > 1);\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function showWatchListUsers() {\r\n");
      out.write("          openLayer(\"usersEdit\");\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function openLayer(nodeId) {\r\n");
      out.write("          var nodeDiv = $(nodeId);\r\n");
      out.write("          closeLayers(nodeId);\r\n");
      out.write("          var divBounds = getNodeBounds(nodeDiv);\r\n");
      out.write("          var ancBounds = getNodeBounds(findRelativeAncestor(nodeDiv));\r\n");
      out.write("          nodeDiv.style.left = (ancBounds.w - divBounds.w - 30) +\"px\";\r\n");
      out.write("          showLayer(nodeDiv, true);\r\n");
      out.write("      }\r\n");
      out.write("    \r\n");
      out.write("      function closeLayers(exclude) {\r\n");
      out.write("          if (exclude != \"wlEdit\")\r\n");
      out.write("              hideLayer(\"wlEdit\");\r\n");
      out.write("          if (exclude != \"usersEdit\")\r\n");
      out.write("              hideLayer(\"usersEdit\");\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      //\r\n");
      out.write("      // Watch list membership\r\n");
      out.write("      //\r\n");
      out.write("      function addToWatchList(pointId) {\r\n");
      out.write("          // Check if this point is already in the watch list.\r\n");
      out.write("          if ($(\"p\"+ pointId) || !owner)\r\n");
      out.write("              return;\r\n");
      out.write("          addToWatchListImpl(pointId);\r\n");
      out.write("          WatchListDwr.addToWatchList(pointId, mango.view.watchList.setDataImpl);\r\n");
      out.write("          fixRowFormatting();\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      var watchListCount = 0;\r\n");
      out.write("      function addToWatchListImpl(pointId) {\r\n");
      out.write("          watchListCount++;\r\n");
      out.write("      \r\n");
      out.write("          // Add a row for the point by cloning the template row.\r\n");
      out.write("          var pointContent = createFromTemplate(\"p_TEMPLATE_\", pointId, \"watchListTable\");\r\n");
      out.write("          pointContent.mangoName = \"watchListRow\";\r\n");
      out.write("          \r\n");
      out.write("          if (owner) {\r\n");
      out.write("              show(\"p\"+ pointId +\"MoveUp\");\r\n");
      out.write("              show(\"p\"+ pointId +\"MoveDown\");\r\n");
      out.write("              show(\"p\"+ pointId +\"Delete\");\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          $(\"p\"+ pointId +\"Name\").innerHTML = pointNames[pointId];\r\n");
      out.write("          \r\n");
      out.write("          // Disable the element in the point list.\r\n");
      out.write("          togglePointTreeIcon(pointId, false);\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function removeFromWatchList(pointId) {\r\n");
      out.write("          removeFromWatchListImpl(pointId);\r\n");
      out.write("          fixRowFormatting();\r\n");
      out.write("          WatchListDwr.removeFromWatchList(pointId);\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function removeFromWatchListImpl(pointId) {\r\n");
      out.write("          watchListCount--;\r\n");
      out.write("          var pointContent = $(\"p\"+ pointId);\r\n");
      out.write("          var watchListTable = $(\"watchListTable\");\r\n");
      out.write("          watchListTable.removeChild(pointContent);\r\n");
      out.write("          \r\n");
      out.write("          // Enable the element in the point list.\r\n");
      out.write("          togglePointTreeIcon(pointId, true);\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function togglePointTreeIcon(pointId, enable) {\r\n");
      out.write("          var node = $(\"ph\"+ pointId +\"Image\");\r\n");
      out.write("          if (node) {\r\n");
      out.write("              if (enable)\r\n");
      out.write("                  dojo.html.setOpacity(node, 1);\r\n");
      out.write("              else\r\n");
      out.write("                  dojo.html.setOpacity(node, 0.2);\r\n");
      out.write("          }\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      //\r\n");
      out.write("      // List state updating\r\n");
      out.write("      //\r\n");
      out.write("      function moveRowDown(pointId) {\r\n");
      out.write("          var watchListTable = $(\"watchListTable\");\r\n");
      out.write("          var rows = getElementsByMangoName(watchListTable, \"watchListRow\");\r\n");
      out.write("          var i=0;\r\n");
      out.write("          for (; i<rows.length; i++) {\r\n");
      out.write("              if (rows[i].id == pointId)\r\n");
      out.write("                  break;\r\n");
      out.write("          }\r\n");
      out.write("          if (i < rows.length - 1) {\r\n");
      out.write("              if (i == rows.length - 1)\r\n");
      out.write("                  watchListTable.append(rows[i]);\r\n");
      out.write("              else\r\n");
      out.write("                  watchListTable.insertBefore(rows[i], rows[i+2]);\r\n");
      out.write("              WatchListDwr.moveDown(pointId.substring(1));\r\n");
      out.write("              fixRowFormatting();\r\n");
      out.write("          }\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function moveRowUp(pointId) {\r\n");
      out.write("          var watchListTable = $(\"watchListTable\");\r\n");
      out.write("          var rows = getElementsByMangoName(watchListTable, \"watchListRow\");\r\n");
      out.write("          var i=0;\r\n");
      out.write("          for (; i<rows.length; i++) {\r\n");
      out.write("              if (rows[i].id == pointId)\r\n");
      out.write("                  break;\r\n");
      out.write("          }\r\n");
      out.write("          if (i != 0) {\r\n");
      out.write("              watchListTable.insertBefore(rows[i], rows[i-1]);\r\n");
      out.write("              WatchListDwr.moveUp(pointId.substring(1));\r\n");
      out.write("              fixRowFormatting();\r\n");
      out.write("          }\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function fixRowFormatting() {\r\n");
      out.write("          var rows = getElementsByMangoName($(\"watchListTable\"), \"watchListRow\");\r\n");
      out.write("          if (rows.length == 0) {\r\n");
      out.write("              show(\"emptyListMessage\");\r\n");
      out.write("          }\r\n");
      out.write("          else {\r\n");
      out.write("              hide(\"emptyListMessage\");\r\n");
      out.write("              for (var i=0; i<rows.length; i++) {\r\n");
      out.write("                  if (i == 0) {\r\n");
      out.write("                      hide(rows[i].id +\"BreakRow\");\r\n");
      out.write("                      hide(rows[i].id +\"MoveUp\");\r\n");
      out.write("                  }\r\n");
      out.write("                  else {\r\n");
      out.write("                      show(rows[i].id +\"BreakRow\");\r\n");
      out.write("                      if (owner)\r\n");
      out.write("                          show(rows[i].id +\"MoveUp\");\r\n");
      out.write("                  }\r\n");
      out.write("                      \r\n");
      out.write("                  if (i == rows.length - 1)\r\n");
      out.write("                      hide(rows[i].id +\"MoveDown\");\r\n");
      out.write("                  else if (owner)\r\n");
      out.write("                      show(rows[i].id +\"MoveDown\");\r\n");
      out.write("              }\r\n");
      out.write("          }\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function showChart(mangoId, event, source) {\r\n");
      out.write("    \t  if (isMouseLeaveOrEnter(event, source)) {\r\n");
      out.write("              // Take the data in the chart textarea and put it into the chart layer div\r\n");
      out.write("              $set('p'+ mangoId +'ChartLayer', $get('p'+ mangoId +'Chart'));\r\n");
      out.write("              showMenu('p'+ mangoId +'ChartLayer', 4, 12);\r\n");
      out.write("    \t  }\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function hideChart(mangoId, event, source) {\r\n");
      out.write("          if (isMouseLeaveOrEnter(event, source))\r\n");
      out.write("        \t  hideLayer('p'+ mangoId +'ChartLayer');\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      //\r\n");
      out.write("      // Image chart\r\n");
      out.write("      //\r\n");
      out.write("      function getImageChart() {\r\n");
      out.write("          var width = dojo.html.getContentBox($(\"imageChartDiv\")).width - 20;\r\n");
      out.write("          startImageFader($(\"imageChartImg\"));\r\n");
      out.write("          WatchListDwr.getImageChartData(getChartPointList(), $get(\"fromYear\"), $get(\"fromMonth\"), $get(\"fromDay\"), \r\n");
      out.write("        \t\t  $get(\"fromHour\"), $get(\"fromMinute\"), $get(\"fromSecond\"), $get(\"fromNone\"), $get(\"toYear\"), \r\n");
      out.write("        \t\t  $get(\"toMonth\"), $get(\"toDay\"), $get(\"toHour\"), $get(\"toMinute\"), $get(\"toSecond\"), $get(\"toNone\"), \r\n");
      out.write("        \t\t  width, 350, function(data) {\r\n");
      out.write("              $(\"imageChartDiv\").innerHTML = data;\r\n");
      out.write("              stopImageFader($(\"imageChartImg\"));\r\n");
      out.write("              \r\n");
      out.write("              // Make sure the length of the chart doesn't mess up the watch list display. Do async to\r\n");
      out.write("              // make sure the rendering gets done.\r\n");
      out.write("              setTimeout('dojo.widget.manager.getWidgetById(\"splitContainer\").onResized()', 2000);\r\n");
      out.write("          });\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function getChartData() {\r\n");
      out.write("    \t  var pointIds = getChartPointList();\r\n");
      out.write("    \t  if (pointIds.length == 0)\r\n");
      out.write("    \t\t  alert(\"");
      if (_jspx_meth_fmt_005fmessage_005f1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n");
      out.write("    \t  else {\r\n");
      out.write("              startImageFader($(\"chartDataImg\"));\r\n");
      out.write("              WatchListDwr.getChartData(getChartPointList(), $get(\"fromYear\"), $get(\"fromMonth\"), $get(\"fromDay\"), \r\n");
      out.write("                      $get(\"fromHour\"), $get(\"fromMinute\"), $get(\"fromSecond\"), $get(\"fromNone\"), $get(\"toYear\"), \r\n");
      out.write("                      $get(\"toMonth\"), $get(\"toDay\"), $get(\"toHour\"), $get(\"toMinute\"), $get(\"toSecond\"), $get(\"toNone\"), \r\n");
      out.write("                      function(data) {\r\n");
      out.write("                  stopImageFader($(\"chartDataImg\"));\r\n");
      out.write("                  window.location = \"chartExport/watchListData.csv\";\r\n");
      out.write("              });\r\n");
      out.write("    \t  }\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      function getChartPointList() {\r\n");
      out.write("          var pointIds = $get(\"chartCB\");\r\n");
      out.write("          for (var i=pointIds.length-1; i>=0; i--) {\r\n");
      out.write("              if (pointIds[i] == \"_TEMPLATE_\") {\r\n");
      out.write("                  pointIds.splice(i, 1);\r\n");
      out.write("              }\r\n");
      out.write("          }\r\n");
      out.write("          return pointIds;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      //\r\n");
      out.write("      // Create report\r\n");
      out.write("      function createReport() {\r\n");
      out.write("          window.location = \"reports.shtm?wlid=\"+ $get(\"watchListSelect\");\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    <table width=\"100%\">\r\n");
      out.write("    <tr><td>\r\n");
      out.write("      <div dojoType=\"SplitContainer\" orientation=\"horizontal\" sizerWidth=\"3\" activeSizing=\"true\" class=\"borderDiv\"\r\n");
      out.write("              widgetId=\"splitContainer\" style=\"width: 100%; height: 500px;\">\r\n");
      out.write("        <div dojoType=\"ContentPane\" sizeMin=\"20\" sizeShare=\"20\" style=\"overflow:auto;padding:2px;\">\r\n");
      out.write("          <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_005fmessage_005f2(_jspx_parent, _jspx_page_context))
        return;
      out.write("</span> ");
      if (_jspx_meth_tag_005fhelp_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("<br/>\r\n");
      out.write("          <img src=\"images/hourglass.png\" id=\"loadingImg\"/>\r\n");
      out.write("          <div id=\"treeDiv\" style=\"display:none;\"><div dojoType=\"Tree\" widgetId=\"tree\"></div></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div dojoType=\"ContentPane\" sizeMin=\"50\" sizeShare=\"50\" style=\"overflow:auto; padding:2px 10px 2px 2px;\">\r\n");
      out.write("          <table cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td class=\"smallTitle\">");
      if (_jspx_meth_fmt_005fmessage_005f3(_jspx_parent, _jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_tag_005fhelp_005f1(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("              <td align=\"right\">\r\n");
      out.write("                ");
      if (_jspx_meth_sst_005fselect_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \r\n");
      out.write("                <div id=\"wlEditDiv\" style=\"display:inline;\" onmouseover=\"showWatchListEdit()\">\r\n");
      out.write("                  ");
      if (_jspx_meth_tag_005fimg_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  <div id=\"wlEdit\" style=\"visibility:hidden;left:0px;top:15px;\" class=\"labelDiv\"\r\n");
      out.write("                          onmouseout=\"hideLayer(this)\">\r\n");
      out.write("                    ");
      if (_jspx_meth_fmt_005fmessage_005f4(_jspx_parent, _jspx_page_context))
        return;
      out.write("<br/>\r\n");
      out.write("                    <input type=\"text\" id=\"newWatchListName\"\r\n");
      out.write("                            onkeypress=\"if (event.keyCode==13) $('saveWatchListNameLink').onclick();\"/>\r\n");
      out.write("                    <a class=\"ptr\" id=\"saveWatchListNameLink\" onclick=\"saveWatchListName()\">");
      if (_jspx_meth_fmt_005fmessage_005f5(_jspx_parent, _jspx_page_context))
        return;
      out.write("</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div id=\"usersEditDiv\" style=\"display:inline;\" onmouseover=\"showWatchListUsers()\">\r\n");
      out.write("                  ");
      if (_jspx_meth_tag_005fimg_005f1(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  <div id=\"usersEdit\" style=\"visibility:hidden;left:0px;top:15px;\" class=\"labelDiv\">\r\n");
      out.write("                    ");
      if (_jspx_meth_tag_005fsharedUsers_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                ");
      if (_jspx_meth_tag_005fimg_005f2(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_tag_005fimg_005f3(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_tag_005fimg_005f4(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_tag_005fimg_005f5(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("          <div id=\"watchListDiv\" class=\"watchListAttr\">\r\n");
      out.write("            <table style=\"display:none;\">\r\n");
      out.write("              <tbody id=\"p_TEMPLATE_\">\r\n");
      out.write("                <tr id=\"p_TEMPLATE_BreakRow\"><td class=\"horzSeparator\" colspan=\"5\"></td></tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td width=\"1\">\r\n");
      out.write("                    <table cellpadding=\"0\" cellspacing=\"0\" class=\"rowIcons\">\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <td onmouseover=\"mango.view.showChange('p'+ getMangoId(this) +'Change', 4, 12);\"\r\n");
      out.write("                                onmouseout=\"mango.view.hideChange('p'+ getMangoId(this) +'Change');\"\r\n");
      out.write("                                id=\"p_TEMPLATE_ChangeMin\" style=\"display:none;\"><img alt=\"\" id=\"p_TEMPLATE_Changing\" \r\n");
      out.write("                                src=\"images/icon_edit.png\"/><div id=\"p_TEMPLATE_Change\" class=\"labelDiv\" \r\n");
      out.write("                                style=\"visibility:hidden;top:10px;left:1px;\" onmouseout=\"hideLayer(this);\">\r\n");
      out.write("                          ");
      if (_jspx_meth_tag_005fimg_005f6(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </div></td>\r\n");
      out.write("                        <td id=\"p_TEMPLATE_ChartMin\" style=\"display:none;\" onmouseover=\"showChart(getMangoId(this), event, this);\"\r\n");
      out.write("                                onmouseout=\"hideChart(getMangoId(this), event, this);\"><img alt=\"\" \r\n");
      out.write("                                src=\"images/icon_chart.png\"/><div id=\"p_TEMPLATE_ChartLayer\" class=\"labelDiv\" \r\n");
      out.write("                                style=\"visibility:hidden;top:0;left:0;\"></div><textarea\r\n");
      out.write("                                style=\"display:none;\" id=\"p_TEMPLATE_Chart\">");
      if (_jspx_meth_tag_005fimg_005f7(_jspx_parent, _jspx_page_context))
        return;
      out.write("</textarea></td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                  </td>\r\n");
      out.write("                  <td id=\"p_TEMPLATE_Name\" style=\"font-weight:bold\"></td>\r\n");
      out.write("                  <td id=\"p_TEMPLATE_Value\" align=\"center\"><img src=\"images/hourglass.png\"/></td>\r\n");
      out.write("                  <td id=\"p_TEMPLATE_Time\" align=\"center\"></td>\r\n");
      out.write("                  <td style=\"width:1px; white-space:nowrap;\">\r\n");
      out.write("                    <input type=\"checkbox\" name=\"chartCB\" id=\"p_TEMPLATE_ChartCB\" value=\"_TEMPLATE_\" checked=\"checked\"\r\n");
      out.write("                            title=\"");
      if (_jspx_meth_fmt_005fmessage_005f6(_jspx_parent, _jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("                    ");
      if (_jspx_meth_tag_005fimg_005f8(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_tag_005fimg_005f9(_jspx_parent, _jspx_page_context))
        return;
      if (_jspx_meth_tag_005fimg_005f10(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_tag_005fimg_005f11(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr><td colspan=\"5\" style=\"padding-left:16px;\" id=\"p_TEMPLATE_Messages\"></td></tr>\r\n");
      out.write("              </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            <table id=\"watchListTable\" width=\"100%\"></table>\r\n");
      out.write("            <div id=\"emptyListMessage\" style=\"color:#888888;padding:10px;text-align:center;\">\r\n");
      out.write("              ");
      if (_jspx_meth_fmt_005fmessage_005f7(_jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </td></tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr><td>\r\n");
      out.write("      <div class=\"borderDiv\" style=\"width: 100%;\">\r\n");
      out.write("        <table width=\"100%\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"smallTitle\">");
      if (_jspx_meth_fmt_005fmessage_005f8(_jspx_parent, _jspx_page_context))
        return;
      out.write(' ');
      if (_jspx_meth_tag_005fhelp_005f2(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("            <td align=\"right\">");
      if (_jspx_meth_tag_005fdateRange_005f0(_jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("            <td>\r\n");
      out.write("              ");
      if (_jspx_meth_tag_005fimg_005f12(_jspx_parent, _jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!--                       onclick=\"getChartData()\"/> -->\r\n");
      out.write("            </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr><td colspan=\"3\" id=\"imageChartDiv\"></td></tr>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("    </td></tr>\r\n");
      out.write("    \r\n");
      out.write("    </table>\r\n");
      out.write("  ");
      return;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
