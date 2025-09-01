
// Description: Java 11 MssCF Reference for Service Relationship Host.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecMssCF;

import java.sql.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cfcore.MssCF.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfsec.CFSecObj.*;

/**
 *	CFSecMssCFReferenceServiceHost binds Service.Host
 *	as an instance of MssCFGenReferenceObj.
 */
public class CFSecMssCFReferenceServiceHost
	extends MssCFGenReferenceObj
{
	private static final long serialVersionUID = 1L;

	public CFSecMssCFReferenceServiceHost() {
		super();
	}

	public CFSecMssCFReferenceServiceHost( MssCFEngine argEngine ) {
		super( argEngine,
			"any",
			null,
			"Service",
			"Host",
			"HostNode" );
	}

	public ICFLibAnyObj dereference( MssCFGenContext genContext ) {
		final String S_ProcName = "CFSecMssCFReferenceServiceHost.dereference() ";

		if( genContext == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext" );
		}

		ICFLibAnyObj genDef = genContext.getGenDef();
		if( genDef == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"genContext.getGenDef()" );
		}

		ICFSecHostNodeObj obj;

		if( genDef instanceof ICFSecServiceObj ) {
			obj = (ICFSecHostNodeObj)((ICFSecServiceObj)genDef).getOptionalContainerHost();
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"genContext.getGenDef()",
				genDef,
				"ICFSecServiceObj" );
		}

		return( obj );
	}
}
