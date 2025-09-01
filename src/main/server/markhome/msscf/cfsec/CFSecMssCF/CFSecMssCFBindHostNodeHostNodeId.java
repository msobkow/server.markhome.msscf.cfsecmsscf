
// Description: Java 11 MssCF Binding for HostNode Column HostNodeId.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import org.apache.commons.codec.binary.Base64;

/**
 *	CFSecMssCFBindHostNodeHostNodeId binds HostNode.HostNodeId
 *	as an instance of MssCFGenBindObj.
 */
public class CFSecMssCFBindHostNodeHostNodeId
	extends MssCFGenBindObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFBindHostNodeHostNodeId() {
		super();
	}

	public CFSecMssCFBindHostNodeHostNodeId( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"HostNode",
			"HostNodeId" );
	}
	public Object getValueObject( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindHostNodeHostNodeId.getValueObject() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		long hostNodeId;
		if( genDef instanceof ICFSecHostNodeObj ) {
			hostNodeId = ((ICFSecHostNodeObj)genDef).getRequiredHostNodeId();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecHostNodeObj" );
		}

		return( hostNodeId );
	}

	public String expandBody( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFBindHostNodeHostNodeId.expandBody() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"expandBody",
				1,
				"genContext.getGenDef()" );
		}

		String ret;

		if( genDef instanceof ICFSecHostNodeObj ) {
			long hostNodeId = ((ICFSecHostNodeObj)genDef).getRequiredHostNodeId();
			ret = Long.toString( hostNodeId );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"expandBody",
				"genContext.getGenDef()",
				genDef,
				"ICFSecHostNodeObj" );
		}

		return( ret );
	}

}
